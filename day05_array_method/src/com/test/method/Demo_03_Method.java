package com.test.method;

public class Demo_03_Method {
    public static void main(String[] args) {
       int reseltadd = add();
        System.out.println(reseltadd);
    }
    //无参有返回值方法定义和调用
    public static int add(){
        int a = 20;
        int b = 30;
        int sum = a+b;
        return sum;
    }
}
