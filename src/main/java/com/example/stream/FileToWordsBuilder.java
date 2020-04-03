package com.example.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToWordsBuilder {

    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath) throws IOException {
        Files.lines(Paths.get(filePath))
                .skip(1)
                .forEach(line -> {
                    for(String w: line.split("[ ,.?]+")) {
                        builder.add(w);
                    }
                });
    }

    public static void main(String[] args) throws IOException {
        new FileToWordsBuilder("d:\\test\\chese.dat").builder.build()
                .limit(7)
                .map(w -> w + "-")
                .forEach(System.out::print);
    }
}
