package com.test.homehork;

public class Android extends Developer{
    public Android() {
    }

    public Android(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工编号为:"+getId()+"的"+getName()+"正在研发电商的手机客户端软件");
    }
}
