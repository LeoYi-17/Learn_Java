package com.test.inner_class;

public class Students {
    String name = "张三";
    class Inner{
        String name = "李四";
        public void display(){
            String name = "王五";
            System.out.println(name);//王五
            System.out.println(this.name);//李四
            System.out.println(Students.this.name);//张三
        }
    }
}
