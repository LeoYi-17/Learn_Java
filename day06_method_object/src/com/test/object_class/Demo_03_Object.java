package com.test.object_class;

public class Demo_03_Object {
    public static void main(String[] args) {
        Demo_02_Object D2 = new Demo_02_Object();
        D2.name = "张三";
        D2.age = 18;
        System.out.println(D2.name);
        System.out.println(D2.age);
        D2.drink();
        D2.eat();
        D2.la();
        D2.sa();
    }
}
