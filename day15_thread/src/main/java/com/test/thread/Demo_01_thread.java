package com.test.thread;

public class Demo_01_thread {
    public static void main(String[] args) throws InterruptedException {
        //创建自定义线程对象
        MyThread myThread = new MyThread();

        //设置线程名称
        myThread.setName("MyThread类");

        //调用start方法开启线程,jvm自动执行run方法
        myThread.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000L);
            System.out.println(Thread.currentThread().getName()+"：Main正在执行..."+i);
        }
    }
}
