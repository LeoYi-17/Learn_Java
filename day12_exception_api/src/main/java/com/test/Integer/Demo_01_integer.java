package com.test.Integer;

import org.junit.Test;

public class Demo_01_integer {
    @Test
    public void test01(){
        //构造方法创建Integer对象,过时了
        // Integer i1 = new Integer(1);
        // System.out.println("i1 = " + i1);
        //通过静态方法创建Integer对象
        Integer i1 = Integer.valueOf(1);
        System.out.println("i1 = " + i1);

        Integer i2 = Integer.valueOf("11111");
        System.out.println("i2 = " + i2);
    }
    @Test
    public void test02(){
        // int -> Integer -> 装箱
        // 装箱:将基本类型转成对应的包装类 ->调用别人的方法,方法要求我们传递包装类
        Integer i = Integer.valueOf(10);
        System.out.println(i);
        // Integer -> int -> 拆箱
        // 拆箱:将包装类转成对应的基本类型 -> 如果需要包装类表示的数据进行运算,就需要转成基本类型
        int i1 = i.intValue();
        System.out.println(i1+1);
    }
    @Test
    public void test03(){
        // 自动装箱
        Integer i = 10;
        System.out.println(i);
        // 自动拆箱
        /*
            i=i+10->先调用intValue将i拆箱成int然后+10
            然后将结果再调用valueof进行装箱，赋值给Integer型的i
        */
        i += 10;
        System.out.println(i);
    }
    @Test
    public void test04() {
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2);//true,Integer类型缓存对象在-128-127之前为true

        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3 == i4);//false
    }
    @Test
    public void test05() {
        //基本类型往String转
        int i = 10;
        String s = i + "";
        System.out.println(s+1);

        System.out.println("===============");

        String s1 = String.valueOf(10);
        System.out.println(s1+1);
    }
    @Test
    public void test06() {
        //String转成基本数据类型
        int i = Integer.parseInt("10");
        System.out.println(i+1);
    }
}
