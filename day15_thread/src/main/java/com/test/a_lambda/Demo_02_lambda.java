package com.test.a_lambda;

public class Demo_02_lambda {
    public static void main(String[] args) {
        metod(new USB() {
            @Override
            public void open() {
                System.out.println("USB打开了...");
            }
        });
        System.out.println("————————————————————————————————");

        metod(()-> System.out.println("USB打开了..."));

    }
    public static void metod(USB usb){
        usb.open();
    }
}
