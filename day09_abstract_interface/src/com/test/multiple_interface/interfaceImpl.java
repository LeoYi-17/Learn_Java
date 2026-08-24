package com.test.multiple_interface;

public class interfaceImpl implements interfaceA,interfaceB{
    @Override
    public void method() {
        //调用接口A的方法
        interfaceA.super.method();
        //调用接口B的方法
        interfaceB.super.method();

    }
}
