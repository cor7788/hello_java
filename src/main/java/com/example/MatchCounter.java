package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MatchCounter implements Callable<Integer> {

    private File directory;
    private String keyword;

    public MatchCounter(File directory, String keyword) {
        this.directory = directory;
        this.keyword = keyword;
    }

    @Override
    public Integer call() throws Exception {
        int count = 0;

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) return count;

        ArrayList<Future<Integer>> list = new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory()) {
                MatchCounter matchCounter = new MatchCounter(file, keyword);
                FutureTask<Integer> task = new FutureTask<>(matchCounter);
                list.add(task);
                Thread thread = new Thread(task);
                thread.start();
            } else {
                if (search(file)) count++;
            }
        }

        for (Future<Integer> result : list) {
            try {
                count += result.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return count;
    }

    private boolean search(File file) {
        try (Scanner scanner = new Scanner(file, "UTF-8")) {
            boolean found = false;
            while (!found && scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(keyword)) found = true;
            }
            return found;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
