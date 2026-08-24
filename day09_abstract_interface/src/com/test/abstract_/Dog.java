package com.test.abstract_;

public class Dog extends Animals{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void drink() {
        System.out.println("用舌头卷水喝");
    }
}
