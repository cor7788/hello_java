package com.example.collection;

import java.util.*;

public class AddDemo {
    public static void main(String[] args) {
        String[] arr = {"java", "javascript", "html", "css"};
        List<String> aList = Arrays.asList(arr);
        System.out.println(Arrays.toString(arr));
        // 修改返回的list，原来的数组也会改变
        aList.set(0, "python");
        // 添加和删除操作会报错, UnsupportedOperationException
        // aList.add("go");
        System.out.println(Arrays.toString(arr));

        Collection<Integer> aCollection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] aArr = {6,7,8,9,10};
        aCollection.addAll(Arrays.asList(aArr));
        // 添加集合的速度更快，但是无法使用这种方式创建集合
        Collections.addAll(aCollection, 11,12,13,14,15);
        Collections.addAll(aCollection, aArr);
        System.out.println(aCollection);
    }
}
