package com.example.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetOfWords {

    public static void main(String[] args) throws IOException {
        TreeSet<String> set = Files.lines(Paths.get("d:\\test\\chese.dat"))
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .filter(w -> !w.matches("\\d+"))
                .map(String::trim)
                .filter(w -> w.length() > 2)
                .limit(100)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
    }
}
