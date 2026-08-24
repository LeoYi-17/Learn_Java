package com.test.method;

public class Demo_02_Method {
    public static void main(String[] args) {
        add(1,2);
    }
    //有参无返回值方法定义和调用
    public static void add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
}
