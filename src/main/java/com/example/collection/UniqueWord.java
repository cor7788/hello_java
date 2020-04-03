package com.example.collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeSet;

public class UniqueWord {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(
                Paths.get("C:\\Users\\cor\\IdeaProjects\\hello_java\\src\\main\\java\\com\\example\\collection\\ListDemo.java"));

//        TreeSet<String> treeSet = new TreeSet<>();
        TreeSet<String> treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for(String line : lines) {
            for(String w : line.split("\\W+")) {
                if(w.trim().length() > 0)
                    treeSet.add(w);
            }
        }
        System.out.println(treeSet);
    }
}
