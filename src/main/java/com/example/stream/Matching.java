package com.example.stream;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Matcher extends BiPredicate<Stream<Integer>, Predicate<Integer>>{}

public class Matching {

    static void show(Matcher matcher, int val) {
        Stream<Integer> stream = IntStream.rangeClosed(1, 9)
                .boxed()
                .peek(n -> System.out.printf("%d ", n));
        boolean result = matcher.test(stream, n -> n < val);
        System.out.println(result);
    }

    public static void main(String[] args) {
        show(Stream::allMatch, 10);
        show(Stream::allMatch, 4);
        show(Stream::anyMatch, 2);
        show(Stream::anyMatch, 0);
    }
}
