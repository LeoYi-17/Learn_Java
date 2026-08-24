package com.test.lombok;

public class Demo_01_test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(18);
        System.out.println(person);
    }
}
