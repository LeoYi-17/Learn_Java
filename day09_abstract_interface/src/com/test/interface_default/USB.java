package com.test.interface_default;

public interface USB {
    //默认方法
    public default void methodDef(){
        System.out.println("接口中的默认方法");
    }
}
