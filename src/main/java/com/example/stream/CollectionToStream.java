package com.example.stream;

import java.util.*;
import java.util.stream.Stream;

public class CollectionToStream {

    public static void main(String[] args) {
        List<Bubble> list = Arrays.asList(new Bubble(1), new Bubble(21), new Bubble(15));
        ArrayList<Bubble> bubbles = new ArrayList<>(list);
        int sum = bubbles.stream()
                .mapToInt(Bubble::getI)
                .sum();
        System.out.println(sum);

        HashSet<String> set = new HashSet<>(Arrays.asList("It's a wonderful day! Let's go outside!".split(" ")));
        set.stream()
                .map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("小明", 11);
        map.put("小红", 12);
        map.put("小小", 10);
        map.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);
    }
}
