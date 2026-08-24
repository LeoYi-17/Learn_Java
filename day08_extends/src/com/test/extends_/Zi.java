package com.test.extends_;

public class Zi extends Fu{
    public void numzi(){
        System.out.println("子类numzi方法");
    }
    //重写的方法
    @Override
    public void num(){
        System.out.println("子类num方法");
    }
}
