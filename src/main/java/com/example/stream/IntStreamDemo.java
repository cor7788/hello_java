package com.example.stream;

import java.util.stream.IntStream;

class Repeat {
    public static void repeat(int n, Runnable action) {
        IntStream.range(0, n).forEach(i -> action.run());
    }
}

public class IntStreamDemo {
    public static void main(String[] args) {
        // 部分使用流
        int result = 0;
        for (int i: IntStream.range(10, 20).toArray()) {
            result += i;
        }
        System.out.println(result);

        // 完全使用流
        System.out.println(IntStream.range(10, 20).sum());

        Repeat.repeat(3, () -> System.out.println("hello"));
    }
}
