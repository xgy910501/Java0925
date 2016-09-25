package com.xue.test.hashtable;

import java.util.Hashtable;

/**
 * Created by Administrator on 2016/9/25.
 */
public class HashtableTest {

    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"hello");
        hashtable.put(3,"hi");
        hashtable.put(5,"test");

        System.out.println(hashtable.size());
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer.toString()+"=="+hashtable.get(integer));
        }
    }
}
