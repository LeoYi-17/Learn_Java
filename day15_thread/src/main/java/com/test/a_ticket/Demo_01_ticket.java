package com.test.a_ticket;

public class Demo_01_ticket {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread thread1 = new Thread(myTicket,"张三");
        Thread thread2 = new Thread(myTicket,"李四");
        Thread thread3 = new Thread(myTicket,"王五");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
