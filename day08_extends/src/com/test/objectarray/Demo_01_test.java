package com.test.objectarray;

public class Demo_01_test {
    public static void main(String[] args) {
        //1.定义存储Person对象的数组
        Person arr1[] = new Person[3];
        //2.创建三个Person对象
        Person P1 = new Person("张三",20);
        Person P2 = new Person("李四",22);
        Person P3 = new Person("王五",23);
        //3.将三个对象放到数组中
        arr1[0] = P1;
        arr1[1] = P2;
        arr1[2] = P3;
        //4.遍历数组
        for (int i = 0; i < arr1.length; i++) {
            Person P = arr1[i];
            System.out.println("姓名:"+P.getName()+"\t"+"年龄:"+P.getAge());
        }
    }
}
