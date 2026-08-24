package com.test.duotai;

public class Dog extends Animals{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
    //特有方法
    public void lookHome(){
        System.out.println("狗看家");
    }
}
