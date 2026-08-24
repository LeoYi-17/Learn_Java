package com.test.code;

public class Person {
    public Person() {
        System.out.println("无参构造方法");
    }

    //构造代码块
    {
        System.out.println("构造代码块");
    }

    //静态代码块
    static{
        System.out.println("静态代码块");
    }

}
