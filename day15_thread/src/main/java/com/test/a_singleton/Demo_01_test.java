package com.test.a_singleton;

public class Demo_01_test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.getSingleton();
            System.out.println(singleton);
        }
    }
}
