package com.xue.test.hashtable;


import java.util.Hashtable;
import java.util.Random;

/**
 * Created by Administrator on 2016/9/25.
 */
// 随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），并判断两种方法的效率和分布。
public class E34 {

    public static void main(String[] args) {
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
       /* for (int i = 0; i < 10000; i++) {
            double d = Math.random();
            int a = (int) (d*20+1);
            hashtable.put(i,a);
            System.out.println(hashtable.get(i));
        }*/

        Random random = new Random();
        int a = random.nextInt();
        System.out.println(a);
    }


}
