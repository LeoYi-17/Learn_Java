package com.test.multiple_interface;

public interface interfaceB {
    public default void method(){
        System.out.println("接口B的默认方法");
    }
}
