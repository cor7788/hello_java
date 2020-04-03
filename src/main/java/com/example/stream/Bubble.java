package com.example.stream;

public class Bubble {

    private static int count = 0;
    private final int i;

    public Bubble(int n) {
        i = n;
    }

    public int getI() {
        return i;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "i=" + i +
                '}';
    }

    public static Bubble bubble() {
        return new Bubble(count++);
    }
}
