package com.test.object_class;

import java.util.ArrayList;

public class Demo_02_test {
    public static void main(String[] args) {
/*        a.如果不重写equals方法,会调用Object中的equals,比较的是对象的地址值
          b.如果重写了equals方法,我们要比较两个对象的内容*/
        Person p1 = new Person("张三", 10);
        Person p2 = new Person("张三", 10);

        ArrayList<String> list = new ArrayList<>();
        System.out.println(p1.equals(p2));//比较属性

        System.out.println("==========================");
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);//比较内存地址
        System.out.println(s1.equals(s2));//重写后比较属性
    }
}
