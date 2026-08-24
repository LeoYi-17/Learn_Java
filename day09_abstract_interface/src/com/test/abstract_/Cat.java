package com.test.abstract_;

public class Cat extends Animals{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void drink() {
        System.out.println("猫舔着水喝");
    }
}
