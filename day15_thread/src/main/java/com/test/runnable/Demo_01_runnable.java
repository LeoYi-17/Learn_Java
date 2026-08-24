package com.test.runnable;

public class Demo_01_runnable {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000L);
            System.out.println(Thread.currentThread().getName()+"：Main正在执行..."+i);
        }
    }
}
