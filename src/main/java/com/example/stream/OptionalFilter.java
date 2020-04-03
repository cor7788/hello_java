package com.example.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class OptionalFilter {

    static String[] arr = { "foo", "" };

    static Stream<String> getStream() {
        return Arrays.stream(arr);
    }

    static void test(String name, Predicate<String> pre) {
        System.out.println("------" + name + "------");
        // 这里是 <=
        for (int i = 0; i <= arr.length; i++) {
            Optional<String> o = getStream().skip(i)
                    .findFirst()
                    .filter(pre);
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        test("filter-true", str -> true);
        test("filter-false", str -> false);
        test("filter-str != ''", str -> str != "");
    }
}
