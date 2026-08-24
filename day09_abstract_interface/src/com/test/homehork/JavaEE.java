package com.test.homehork;

public class JavaEE extends Developer{
    public JavaEE() {
    }

    public JavaEE(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工编号为:"+getId()+"的"+getName()+"正在开发电商网站");
    }
}
