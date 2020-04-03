package com.example.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomWords implements Supplier<String> {

    List<String> list = new ArrayList<>();
    Random random = new Random();

    RandomWords(String filename) throws IOException {
        Path path = Paths.get("D:\\test", filename);
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] strings = line.split("[ ,.?]+");
            for (String word : strings) {
                list.add(word.toLowerCase());
            }
        }
    }

    public String get() {
        return list.get(random.nextInt(list.size()));
    }

    @Override
    public String toString() {
        // return String.join(" ", list);
        return list.stream()
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) throws IOException {
        String s = Stream.generate(new RandomWords("chese.dat"))
                .limit(10)
                .collect(Collectors.joining(" "));
        System.out.println(s);
    }
}
