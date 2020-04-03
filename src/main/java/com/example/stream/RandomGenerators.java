package com.example.stream;

import java.util.Random;
import java.util.stream.Stream;

public class RandomGenerators {

    public static <T> void show(Stream<T> stream) {
        stream.limit(4)
                .forEach(System.out::println);
        System.out.println("------------");
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        show(random.ints().boxed());
        show(random.longs().boxed());
        show(random.doubles().boxed());
        // 控制上限和下限
        show(random.ints(10, 20).boxed());
        show(random.longs(50, 100).boxed());
        show(random.doubles(20, 30).boxed());
        // 控制数量
        show(random.ints(1).boxed());
        show(random.longs(2).boxed());
        show(random.doubles(3).boxed());
        // 控制数量和界限
        show(random.ints(1, 10, 20).boxed());
        show(random.longs(2, 50, 100).boxed());
        show(random.doubles(3, 20, 30).boxed());
    }
}
