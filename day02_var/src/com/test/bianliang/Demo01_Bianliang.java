package com.test.bianliang;

public class Demo01_Bianliang {
    public static void main(String[] args) {
        //byte
        byte num1 = 10;
        System.out.println(num1);
        // short
        short num2 = 10;
        System.out.println(num2);
        //int
        int num3 = 10;
        num3 = 200;
        System.out.println(num3);
        //long 给long赋值的话,值建议后面加L
        long num4 = 10L;
        System.out.println(num4);
        //float 给float赋值,值建议后面加F
        float num5 = 10.5F;
        System.out.println(num5);
        //double
        double num6 = 10.5;
        System.out.println(num6);
        //char
        char num7 = 'a';
        System.out.println(num7);
        //boolean
        boolean num8 = true;
        boolean num9 = false;
        /*
           num9是false
           num8 = num9代表的是将num9的值赋值给变量num8,num8就会由true变成false
         */
        num8 = num9;
        System.out.println(num8);
        //定义一个字符串类型的变量
        String s = "asdadasd";
        System.out.println(s);

    }
}
