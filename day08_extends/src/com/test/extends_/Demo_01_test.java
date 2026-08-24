package com.test.extends_;

public class Demo_01_test {
    public static void main(String[] args) {
        Teacher T1 = new Teacher();
        T1.name = "小王";
        T1.age = 19;
        System.out.println("姓名:"+T1.name+"\t"+"年龄:"+T1.age);
        T1.work();
        //T1.eat();继承之后也不能直接使用父类中私有成员

        System.out.println("——————————————————————————————");

        Manager M1 = new Manager();
        M1.name = "小张";
        M1.age = 23;
        System.out.println("姓名:"+M1.name+"\t"+"年龄:"+M1.age);
        M1.work();
        //M1.eat();继承之后也不能直接使用父类中私有成员

    }
}
