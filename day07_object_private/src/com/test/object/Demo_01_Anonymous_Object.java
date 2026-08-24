package com.test.object;

public class Demo_01_Anonymous_Object {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.name = "张三";
        System.out.println(P1.name);
        P1.eat();
        System.out.println("-------------------------");

        //匿名对象
        new Person().eat();
        System.out.println(new Person().name="李四");
    }
}
