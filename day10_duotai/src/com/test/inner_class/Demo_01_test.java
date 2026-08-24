package com.test.inner_class;

public class Demo_01_test {
    public static void main(String[] args) {
//        person.Heart heart  = new person.Heart();
//        heart.jump();
        Person.Heart heart = new Person().new Heart();
        heart.jump();
    }
}
