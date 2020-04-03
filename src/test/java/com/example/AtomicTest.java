package com.example;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicTest {
    @Test
    public void testAtomic() {
        AtomicLong atomicLong = new AtomicLong(123);
        long id = atomicLong.incrementAndGet();
        System.out.println(id);
    }
}
