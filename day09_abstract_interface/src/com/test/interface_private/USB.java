package com.test.interface_private;

public interface USB {
    //私有方法
    private void method(){
        System.out.println("USB私有方法");
    }
    public default void method2(){
        method();
    }
}
