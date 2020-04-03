package com.example.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class TerminalOperations {

    private static int[] arr = new Random(47).ints(0, 1000)
            .limit(100)
            .toArray();

    public static IntStream rands() {
        return Arrays.stream(arr);
    }

    public static void main(String[] args) {
        int size = 14;

        rands().limit(size)
                .forEach( n -> System.out.printf("%d ", n));
        System.out.println();

        rands().limit(size)
                .parallel()
                .forEach( n -> System.out.printf("%d ", n));
        System.out.println();

        rands().limit(size)
                .parallel()
                .forEachOrdered( n -> System.out.printf("%d ", n));
    }
}
