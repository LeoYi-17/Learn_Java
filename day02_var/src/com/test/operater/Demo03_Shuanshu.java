package com.test.operater;

public class Demo03_Shuanshu {
    public static void main(String[] args) {
        int i = 10;
        //单独使用
        //i ++;
        ++i;
        System.out.println(i);
        System.out.println("=====================");

        int j = 10;
        //混合使用
        //int result = ++j;
        int result = j++;
        System.out.println(result);//10
        System.out.println(j);//11

        System.out.println("=====================");
        int c = 100;
        c = c++;
        System.out.println(c);
        System.out.println(c);
    }
}
