package com.test.A_super;

public class Zi extends Fu{
    public Zi(){
        super();
        System.out.println("子类无参构造方法");
    }
    public Zi(int num){
        //super();
        System.out.println("子类有参构造方法");
    }
}
