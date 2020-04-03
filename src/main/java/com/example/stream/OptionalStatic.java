package com.example.stream;

import java.util.Optional;

public class OptionalStatic {

    static void test(String testName, Optional<String> optional) {
        System.out.println("------" + testName + "------");
        System.out.println(optional.orElse("null"));
    }

    public static void main(String[] args) {
        test("empty", Optional.empty());
        test("of", Optional.of("Thursday"));
        test("ofNullable", Optional.ofNullable("hi"));
        test("ofNullable", Optional.ofNullable(null));
    }
}
