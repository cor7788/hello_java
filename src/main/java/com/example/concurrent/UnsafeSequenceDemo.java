package com.example.concurrent;

public class UnsafeSequenceDemo {
    public static void main(String[] args) {

        UnsafeSequence us = new UnsafeSequence();

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                int value = us.getNext();
                System.out.println(Thread.currentThread() + " : " + value);
            }).start();
        }

    }
}
