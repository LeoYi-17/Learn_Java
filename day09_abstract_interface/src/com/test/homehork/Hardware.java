package com.test.homehork;

public class Hardware extends Maintainer{
    public Hardware() {
    }

    public Hardware(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工编号为:"+getId()+"的"+getName()+"正在修复电脑主板");
    }
}
