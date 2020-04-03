package com.example.stream;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class OptionalMethod {

    static void isPresent(Optional<String> optional) {
        if(optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("nothing inside");
        }
    }

    static void ifPresent(Optional<String> optional) {
        optional.ifPresent(System.out::println);
    }

    static void orElse(Optional<String> optional) {
        System.out.println(optional.orElse("wangcai"));
    }

    static void orElseGet(Optional<String> optional) {
        System.out.println(optional.orElseGet(() -> "tom"));
    }

    static void orElseThrow(Optional<String> optional) {
        try {
            optional.orElseThrow(() -> new Exception("supplied"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void test(String testName, Consumer<Optional<String>> consumer) {
        System.out.println("------" + testName + "------");
        consumer.accept(Stream.of("jack").findFirst());
        consumer.accept(Stream.<String>empty().findAny());
    }

    public static void main(String[] args) {
        test("isPresent", OptionalMethod::isPresent);
        test("ifPresent", OptionalMethod::ifPresent);
        test("orElse", OptionalMethod::orElse);
        test("orElseGet", OptionalMethod::orElseGet);
        test("orElseThrow", OptionalMethod::orElseThrow);
    }
}
