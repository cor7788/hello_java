package com.example.stream;

import java.util.stream.Stream;

public class Bubbles {
    public static void main(String[] args) {
        Stream.generate(Bubble::bubble)
                .limit(3)
                .forEach(System.out::println);
    }
}
