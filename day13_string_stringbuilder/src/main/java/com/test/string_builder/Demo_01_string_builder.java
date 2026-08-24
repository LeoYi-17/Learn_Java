package com.test.string_builder;

import org.junit.Test;

public class Demo_01_string_builder {
    @Test
    public void test1(){
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
    }
    @Test
    public void test2(){
        StringBuilder sb1 = new StringBuilder("张无忌");
        //StringBuilder sb2 = sb1.append("涛哥");
        //System.out.println(sb1);
        //System.out.println(sb2);
        //System.out.println(sb1 == sb2);
        sb1.append("赵敏");
        //链式调用
        sb1.append("小昭").append("周芷若").append("蛛儿");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        String s = sb1.toString();
        System.out.println(s);
    }
    @Test
    public void test03(){
        String s = "上海自来水来自海上";
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder(s);
        //翻转
        sb.reverse();
        //将StringBuilder转成String
        String s1 = sb.toString();

        if (s.equals(s1)){
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }
    }
}
