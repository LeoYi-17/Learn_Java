package com.test.duotai;

public class Cat extends Animals{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //特有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
