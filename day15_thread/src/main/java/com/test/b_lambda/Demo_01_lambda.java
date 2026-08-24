package com.test.b_lambda;

public class Demo_01_lambda {
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public String open(String name) {
                return name + "打开了";
            }
        });
        System.out.println("——————————————————————");
        method(name -> name + "打开了");

        String result = method02().open("键盘");
        System.out.println(result);
    }
    public static void method(USB usb){
        String result = usb.open("鼠标");
        System.out.println(result);
    }
    public static USB method02(){
        return name-> name + "打开了";
    }
}
