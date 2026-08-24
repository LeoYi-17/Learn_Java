package com.test.interface_default;

public class mouse implements USB {
    @Override
    public void methodDef(){
        System.out.println("重写的接口中的默认方法");
    }
}
