package com.test.anonymous_inner_class;

public class Demo_03_test {
    public static void main(String[] args) {
        USB usb = method();
        usb.open();
    }
    public static USB method(){
        return new USB() {
            @Override
            public void open() {
                System.out.println("打开鼠标");
            }
        };
    }
}
