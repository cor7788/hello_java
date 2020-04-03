package com.example;

import java.util.ArrayList;

public class Apple {

    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        for (Apple a : apples) {
            System.out.println(a.id());
        }
    }
}
