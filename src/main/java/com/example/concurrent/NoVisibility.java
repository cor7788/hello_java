package com.example.concurrent;

public class NoVisibility {

    private static boolean ready;
    private static int number;

    // 读取和写入数据不是一个线程，可能会读到过期数据。
    public static class ReaderThread extends Thread {

        @Override
        public void run() {
            while(!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 12;
        ready = true;
    }
}
