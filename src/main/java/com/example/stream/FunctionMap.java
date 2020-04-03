package com.example.stream;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionMap {

    static String[] arr = { "1", "11", "22", "31" };
    static Stream<String> testStream() {
        return Arrays.stream(arr);
    }

    static void test(String desc, Function<String, String> func) {
        System.out.println("------" + desc + "------");
        testStream().map(func)
                .forEach( s -> System.out.printf("%s ", s));
        System.out.println();
    }

    public static void main(String[] args) {
        test("add brackets", s -> "[" + s + "]");
        test("increment", s -> {
            try {
                return Integer.parseInt(s) + 1 + "";
            } catch(NumberFormatException e) {
                return s;
            }
        });
        test("replace", s -> s.replace("2", "9"));
        test("take last digit", s -> s.length() > 0 ? s.charAt(s.length() - 1) + "" : s);
    }
}
