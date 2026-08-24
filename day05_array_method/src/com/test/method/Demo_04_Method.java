package com.test.method;

public class Demo_04_Method {
    public static void main(String[] args) {
        int resultadd = add(1,2);
        System.out.println(resultadd);
    }
    //有参有返回值方法定义和调用
    public static int add(int a,int b){
        int sum = a+b;
        return sum;
    }
}
