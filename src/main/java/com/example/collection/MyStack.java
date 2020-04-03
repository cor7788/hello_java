package com.example.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack<T> {

    private Deque<T> storage = new ArrayDeque<T>();

    public void push(T t) {
        storage.push(t);
    }

    public T peek() {
        return storage.peek();
    }

    public T pop() {
        return storage.pop();
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
