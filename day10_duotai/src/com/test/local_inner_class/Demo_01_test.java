package com.test.local_inner_class;

public class Demo_01_test {
    public static void main(String[] args) {
        USB usb =method();
        usb.open();
    }
    public static USB method(){
        class Mouse implements USB{

            @Override
            public void open() {
                System.out.println("打开鼠标");
            }
        }
        Mouse mouse = new Mouse();
        return mouse;
    }
}
