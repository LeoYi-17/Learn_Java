package com.test.homehork;

public class test {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE();
        javaEE.setId(1);
        javaEE.setName("张三");
        javaEE.work();
        Android android = new Android();
        android.setId(2);
        android.setName("李四");
        android.work();
        Network network = new Network();
        network.setId(3);
        network.setName("王五");
        network.work();
        Hardware hardware = new Hardware();
        hardware.setId(4);
        hardware.setName("赵六");
        hardware.work();
    }
}
