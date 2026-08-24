package com.test.static_;

public class Demo_01_static {
    public static void main(String[] args) {
        Students.classroom = "5-303";
        Students Stu = new Students();
        Stu.id = 001;
        Stu.name = "张三";
        //Stu.classroom = "5-302";
        System.out.println("学号："+Stu.id+"\n"+"姓名："+Stu.name+"\n"+"教室："+Students.classroom);
    }


}
