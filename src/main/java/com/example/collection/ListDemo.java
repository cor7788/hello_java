package com.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,11,12,13,100);
        System.out.println("list: " + list);

        List<Integer> subList = list.subList(3, 7);
        System.out.println("sub: " + subList);
        Collections.shuffle(subList); // 打乱顺序
        System.out.println("shuffled sub: " + subList);
        // 判断是否包含子列表中的元素，与元素的顺序无关
        System.out.println("does list contains all subList: " + list.containsAll(subList));

        // 复制列表
        ArrayList<Integer> listCopy = new ArrayList<>(list);
        Integer[] arr = listCopy.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));


    }
}
