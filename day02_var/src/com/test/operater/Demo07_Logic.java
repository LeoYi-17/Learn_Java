package com.test.operater;

public class Demo07_Logic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //boolean result = ++a > 100 & ++b > 100;
        boolean result = ++a > 100 && ++b > 100;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
