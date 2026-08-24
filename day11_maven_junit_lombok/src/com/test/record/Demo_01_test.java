package com.test.record;

public class Demo_01_test {
    public static void main(String[] args) {
        Person person = new Person("张三",18);
        System.out.println("姓名"+person.name()+"\t"+"年龄"+person.age());
    }
}
