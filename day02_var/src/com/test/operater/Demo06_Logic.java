package com.test.operater;

public class Demo06_Logic {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 10;
        boolean result = (i > j) && (i == k);
        System.out.println(result);// false

        boolean result02 = (i > j) || (i == k);
        System.out.println(result02);// true

        boolean result03 = !(i > j);
        System.out.println(result03);
    }
}
