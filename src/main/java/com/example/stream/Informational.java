package com.example.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Informational {

    public static void main(String[] args) throws IOException {
        long count = FileToWords.stream().count();
        System.out.println(count);

        String max = FileToWords.stream()
                .max(String.CASE_INSENSITIVE_ORDER)
                .orElse("null");
        System.out.println(max);

        String min = FileToWords.stream()
                .min(String.CASE_INSENSITIVE_ORDER)
                .orElse("null");
        System.out.println(min);
    }
}
