package com.test.runnable;

public class Demo_02_runnable {
    public static void main(String[] args) {
         /*
           匿名内部类:
           Thread(Runnable r)
           Thread(Runnable r,String name)
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+":正在执行......" + i);
                }
            }
        },"张三").start();
    }
}
