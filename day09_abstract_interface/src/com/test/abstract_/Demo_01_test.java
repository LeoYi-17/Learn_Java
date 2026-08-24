package com.test.abstract_;

public class Demo_01_test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.drink();
        System.out.println("-------------------------------");
        Cat c = new Cat();
        c.eat();
        c.drink();
    }
}
