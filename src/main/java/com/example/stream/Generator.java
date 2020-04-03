package com.example.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator implements Supplier<String> {

    Random random = new Random(47);
    char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return "" + chars[random.nextInt(chars.length)];
    }

    public static void main(String[] args) {
        String s = Stream.generate(new Generator())
                .limit(10)
                .collect(Collectors.joining(""));
        System.out.println(s);

        // 重复三次
        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);
    }
}
