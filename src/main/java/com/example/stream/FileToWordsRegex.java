package com.example.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileToWordsRegex {

    private String all;

    public FileToWordsRegex(String filePath) throws IOException {
        all = Files.lines(Paths.get(filePath))
                .skip(1)
                .collect(Collectors.joining());
    }

    public Stream<String> stream() {
        return Pattern.compile("[ ,.?]+").splitAsStream(all);
    }

    public static void main(String[] args) throws IOException {
        FileToWordsRegex ftw = new FileToWordsRegex("d:\\test\\chese.dat");
        ftw.stream()
                .limit(7)
                .map( w -> w + " " )
                .forEach(System.out::print);

        ftw.stream()
                .skip(7)
                .limit(2)
                .map(w -> w + "-")
                .forEach(System.out::print);
    }
}
