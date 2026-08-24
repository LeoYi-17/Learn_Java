package com.test.var;

public class Demo_01_Var {
    public static void main(String[] args) {
        add(1,2,3);
    }
    //int...arr可变参数
    public static void add(int...arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
        }
        System.out.println(count);
    }
}
