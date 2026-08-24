package com.test.anonymous_inner_class;

public class Demo_01_test {
    public static void main(String[] args) {
         /*
            a.匿名对象方式new匿名内部类的对象:
              new 接口名/抽象类名(){
                  重写抽象方法
              }.重写的方法名();   -> 类似于:new Mouse().open()
         */
        new USB(){
            @Override
            public void open() {
                System.out.println("打开鼠标");
            }
        }.open();
         /*
          b.有名对象方式new匿名内部类的对象:
            接口名/抽象类名 对象名 =  new 接口名/抽象类名(){
                重写抽象方法
            }
            对象名.重写的方法名()
         */
        USB usb = new USB(){
            @Override
            public void open() {
                System.out.println("打开鼠标");
            }
        };
        usb.open();
    }
}
