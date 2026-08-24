package com.test.b_singleton;

public class Demo_01_test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getSingleton();
                System.out.println(singleton);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getSingleton();
                System.out.println(singleton);
            }
        }).start();
    }
}
