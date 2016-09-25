package com.xue.test.string;

/**
 * Created by Administrator on 2016/9/25.
 */
public class StringBufferTest {

    private static final String ABC = "abc";
    public static void main(String[] args) {
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s+=ABC;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(s.length());

        StringBuffer stringBuffer = new StringBuffer();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(ABC);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);
        System.out.println(stringBuffer.length());
    }
}
