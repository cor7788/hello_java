package com.example;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadTest {

    public static final ThreadLocal<SimpleDateFormat> dateFormat =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    @Test
    public void testInterrupt() {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("thread-");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.isInterrupted();
    }

    @Test
    public void testSDF() {
        String dateStr = dateFormat.get().format(new Date());
        System.out.println(dateStr);
        int n = ThreadLocalRandom.current().nextInt(100);
        System.out.println(n);
    }

    @Test
    public void testReadWriteLock() {
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();
    }
}
