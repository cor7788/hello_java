package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,11,12,13,100);
        // list.add(null); // 可以直接添加 null，因此添加之前要判断。

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer nextEle = iterator.next();
            System.out.print(nextEle + ",");
        }
        System.out.println();

        iterator = list.iterator();
        for (int i = 0; i < 3; i++) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }
}
