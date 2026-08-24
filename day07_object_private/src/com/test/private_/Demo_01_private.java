package com.test.private_;

public class Demo_01_private {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.setName("张三");
        P1.setAge(18);
        System.out.println("姓名:"+P1.getName()+"\n"+"年龄:"+P1.getAge());
    }

}
