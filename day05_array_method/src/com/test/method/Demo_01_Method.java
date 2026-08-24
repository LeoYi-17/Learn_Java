package com.test.method;

public class Demo_01_Method {
    public static void main(String[] args) {
            add();
    }
    //无参无返回值方法定义和调用
    public static void add(){
        int a = 20;
        int b = 30;
        int sum = a+b;
        System.out.println(sum);
    }
}
