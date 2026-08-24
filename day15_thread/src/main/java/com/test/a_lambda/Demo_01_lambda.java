package com.test.a_lambda;

public class Demo_01_lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("正在执行...");
            }
        }).start();
        System.out.println("——————————————————————————————————————————");
        // Lambda表达式
        new Thread(()->System.out.println("正在执行...")).start();
    }
}
