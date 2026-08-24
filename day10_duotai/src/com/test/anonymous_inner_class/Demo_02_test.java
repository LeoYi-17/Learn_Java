package com.test.anonymous_inner_class;

import com.test.local_inner_class.USB;

public class Demo_02_test {
    public static void main(String[] args) {
        method(new com.test.local_inner_class.USB() {
            @Override
            public void open() {
                System.out.println("打开鼠标");
            }
        });
    }
    public static void method(USB usb){
        usb.open();
    }
}
