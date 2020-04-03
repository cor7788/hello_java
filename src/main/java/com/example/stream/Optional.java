package com.example.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Optional {

    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void print(java.util.Optional<String> optional) {
        if(optional.isPresent()) {
            println(optional.get());
        } else {
            println("nothing inside");
        }
    }

    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        stream.forEach(System.out::println);

        println(Stream.<String>empty().findFirst());
        println(Stream.<String>empty().findAny());
        println(Stream.<String>empty().max(String.CASE_INSENSITIVE_ORDER));
        println(Stream.<String>empty().min(Comparator.naturalOrder()));

        print(Stream.of("jack", "lucy", "lily").findFirst());
        print(Stream.of("jack", "lucy", "lily").findAny());
        print(Stream.<String>empty().findFirst());
    }
}
