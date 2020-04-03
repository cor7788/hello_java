package com.example.concurrent;

public class SequenceDemo {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                int value = sequence.getNext();
                System.out.println(Thread.currentThread() + " : " + value);
            }).start();
        }
    }
}
