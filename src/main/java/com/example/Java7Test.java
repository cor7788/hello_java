package com.example;

public class Java7Test {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("hello world");
        });
        thread.run();
    }
}
