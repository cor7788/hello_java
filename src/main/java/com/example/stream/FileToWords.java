package com.example.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FileToWords {

    public static Stream<String> stream() throws IOException {
        return Files.lines(Paths.get("d:\\test\\chese.dat"))
                .flatMap(line -> Arrays.stream(line.split("\\W+")));
    }

    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("d:\\test\\chese.dat"))
                .flatMap( line -> Pattern.compile("\\W+").splitAsStream(line))
                .forEach( s -> System.out.printf("%s ", s));
    }
}
