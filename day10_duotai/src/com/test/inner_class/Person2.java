package com.test.inner_class;

public class Person2 {
    public void eat(){
        //局部内部类
        class Heart{
            public void jump(){
                System.out.println("跳");
            }
        }
        new Heart().jump();
    }
}
