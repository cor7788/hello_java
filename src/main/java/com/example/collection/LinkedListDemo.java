package com.example.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("dog", "cat", "sheep", "sneak", "fish"));
        System.out.println("list: " + list);
        System.out.println("list.getFirst(): " + list.getFirst());
        System.out.println("list.element(): " + list.element());
        System.out.println("list.peek(): " + list.peek());

        System.out.println("list.remove(): " + list.remove());
        System.out.println("list.removeFirst(): " + list.removeFirst());
        System.out.println("list.poll(): " + list.poll());
        System.out.println("list: " + list);

        list.addFirst("pig");
        System.out.println("list.addFirst(): " + list);
        list.offer("wolf");
        System.out.println("list.offer(): " + list);
        list.add("tiger");
        System.out.println("list.add(): " + list);
        list.addLast("lion");
        System.out.println("list.addLast(): " + list);

        list.clear();
        String s = list.removeLast();
    }
}
