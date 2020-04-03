package com.example;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class TraceHandlerTest {

    @Test
    public void testProxy() {

        Object[] elements = new Object[1000];
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            Class[] interfaces = {Comparable.class};
            InvocationHandler handler = new TraceHandler(value);
            elements[i] = Proxy.newProxyInstance(null, interfaces, handler);
        }

        Integer key = new Random().nextInt(elements.length) + 1;
        int index = Arrays.binarySearch(elements, key);

        if(index >= 0) System.out.println(elements[index]);
    }
}
