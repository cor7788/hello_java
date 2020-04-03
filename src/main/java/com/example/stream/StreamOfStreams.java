package com.example.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfStreams {
    public static void main(String[] args) {
        // 使用 map
        Stream.of(1, 2, 3)
                .map(i -> Stream.of("jack", "lucy", "lily"))
                .forEach( i -> System.out.println(i.getClass().getName()));

        // 使用 flatMap
        Stream.of(1,2,3)
                .flatMap( i -> Stream.of("jack", "lucy", "lily"))
                .forEach( s -> System.out.printf("%s-", s));
        System.out.println();

        // 使用 map
        Random random = new Random(47);
        Stream.of(1, 2, 3)
                .flatMapToInt(i -> IntStream.concat(random.ints(0, 100).limit(i)
                        , IntStream.of(-1)))
                .forEach( n -> System.out.printf("%d ", n));
    }
}
