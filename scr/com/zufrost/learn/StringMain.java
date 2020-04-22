package com.zufrost.learn;

public class StringMain {
    static String str = "hello";

    public static void main(String[] args) {
        String str0 ="hello";
//        System.out.println(str == str0);
        char[] ch = {'j', 'a', 'v', 'a'};
//        System.out.println(new String(ch));
        byte[] b = {48, 53, 65, 90, 97};
//        System.out.println(new String(b));
        String str1 = 1 + Integer.parseInt("2") + "java" + false + null;
        System.out.println(str1);
        str1 += str0;
        System.out.println(str1);
    }

}
