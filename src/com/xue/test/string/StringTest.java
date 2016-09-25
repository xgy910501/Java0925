package com.xue.test.string;


/**
 * Created by Administrator on 2016/9/25.
 */
public class StringTest {

    public static void main(String[] args) {
       /* String s = "hello,hi,test";

        int a = s.indexOf("e");
        System.out.println(a);

        System.out.println(s.lastIndexOf("h"));

        String s1 = s.replace("ll","r");
        System.out.println(s1);

        String[] strings = s.split(",");
        for (String string : strings) {
            System.out.println(string);
        }*/

        String strs = "aaa  bbb ccc";
        String[] strings1 = strs.split("  ");
        for (String s2 : strings1) {
            System.out.println(s2);
        }

    }

    public String uper(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='a' && chars[i]<='z'){
                chars[i]+=32;
            }
        }
        return new String(chars);
    }

    public String lower(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A' && chars[i]<='Z'){
                chars[i]-=32;
            }
        }
        return new String(chars);
    }

}
