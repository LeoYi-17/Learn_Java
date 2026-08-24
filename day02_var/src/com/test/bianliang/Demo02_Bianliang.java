package com.test.bianliang;

public class Demo02_Bianliang {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a + b);// 13
        int sub = a - b;
        System.out.println(sub);//  7
        int mul = a * b;
        System.out.println(mul);//  30
        /*
           除号前后如果都是整数,结果只取整数部分 ,小数点直接舍去
           除号前后一旦有一个是小数,结果就是正常小数
         */
        int div = a / b;
        System.out.println(div);//  3
    }
}
