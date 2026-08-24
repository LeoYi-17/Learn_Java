package com.test.operater;

public class Demo05_Compare {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 10;
        boolean result01 = i == j;
        System.out.println(result01);

        System.out.println(i > j);// false
        System.out.println(i < j);// true
        System.out.println(i >= k);// true
        System.out.println(i <= k);// true
        System.out.println(i != k);// false
    }
}
