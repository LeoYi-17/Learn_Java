package com.test.inner_class_interface;

public class Demo_01_test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        USB usb = method01();
        usb.open();
        method02(mouse);
    }
    /**
     * 接口做为方法返回值
     */
    public static USB method01(){
        Mouse mouse = new Mouse();
        return mouse;
    }
    /**
     * 接口做为方法的参数传递
     */
    public static void method02(USB usb){
        usb.open();
    }
}
