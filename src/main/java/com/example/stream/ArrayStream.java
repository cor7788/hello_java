package com.example.stream;

import java.util.Arrays;

public class ArrayStream {

    public static void main(String[] args) {
        double[] da = { 1.234, 2.345, 3.456 };
        int[] ia = { 1, 2, 3, 4, 5, 11, 12, 13};
        Arrays.stream(da)
                .forEach( n -> System.out.printf("%f ", n));
        System.out.println();

        Arrays.stream(ia)
                .forEach( n -> System.out.printf("%d ", n));
        System.out.println();

        Arrays.stream(ia, 5, 8)
                .forEach( n -> System.out.printf("%d ", n));
    }
}
