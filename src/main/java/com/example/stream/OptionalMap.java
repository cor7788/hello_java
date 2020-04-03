package com.example.stream;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class OptionalMap {

    static String[] arr = {"12", ""};

    static Stream<String> stream() {
        return Stream.of(arr);
    }

    static void testMap(String name, Function<String, String> func) {
        System.out.println("------" + name + "------");
        for (int i = 0; i <= arr.length; i++) {
            Optional<String> o = stream().skip(i)
                    .findFirst()
                    .map(func);
            System.out.println(o);
        }
    }

    static void testFlatMap(String name, Function<String, Optional<String>> func) {
        System.out.println("------" + name + "------");
        for (int i = 0; i <= arr.length; i++) {
            Optional<String> o = stream().skip(i)
                    .findFirst()
                    .flatMap(func);
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        testMap("parseInt", str -> {
            try {
                return Integer.parseInt(str) + "";
            } catch (NumberFormatException e) {
                return "数字转换异常";
            }
        });

        testFlatMap("add-bracket", str -> Optional.of("[" + str + "]"));
    }
}
