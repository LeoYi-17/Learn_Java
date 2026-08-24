package com.test.B_super;

public class Fu {
    public int num = 100;
    public Fu(){
        System.out.println("父类无参构造");
    }
    public Fu(int num){
        System.out.println("父类有参构造");
    }
    public void show(){
        System.out.println("父类show方法");
    }
}
