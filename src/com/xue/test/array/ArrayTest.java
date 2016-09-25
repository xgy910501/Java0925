package com.xue.test.array;


import java.beans.IntrospectionException;
import java.util.Objects;
import java.util.jar.JarEntry;

/**
 * Created by Administrator on 2016/9/25.
 */
public class ArrayTest {

    public static void main(String[] args) {
        /*int[] ints = new int[5];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
            System.out.println(ints[i]);
        }
        System.out.println(ints.length-1);*/

        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "hi...";
        strings[2] = "test";
        for (String string : strings) {
            System.out.println(string);
        }

        Object[] objects = new Object[3];
        objects[0] = "haha..";
        objects[1] = 1;
        objects[2] = true;
        for (Object object : objects) {
            System.out.println(object);
        }

        int[][] ints = new int[2][3];
        for (int i = 0; i <ints.length ; i++) {
            for (int j = 0; j <ints[i].length ; j++) {
                ints[i][j] = i+j;
                System.out.println(ints[i][j]);
            }
        }
    }
}
