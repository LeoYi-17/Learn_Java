package com.test.construct;

public class Demo_01_construct {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.setName("张三");
        P1.setAge(18);
        System.out.println(P1.getName()+"\t"+P1.getAge());
        System.out.println("===================");
        //利用有参构造创建对象并为属性赋值
        Person P2 = new Person("李四",19);
        P2.setAge(20);
        System.out.println(P2.getName()+"\t"+P2.getAge());
        System.out.println("===================");
        Students Stu = new Students("24213028","芦艺",23,"JAVA程序设计",90);
        System.out.println("学号:"+Stu.getId()+"\t"+"姓名:"+Stu.getName()+"\t"+"年龄:"+Stu.getAge()+"\n"+"学科:"+Stu.getSubject()+"\t"+"成绩:"+Stu.getScore());
    }
}
