package com.test.datatype;

public class Demo01_DataType {
    public static void main(String[] args) {
         /*
           100默认类型int
           num1类型为long
           将100赋值给long型的num1,相当于将取值范围小的类型赋值给取值范围大的类型
           发生了自动类型转换
         */
        long num1 = 100;
        System.out.println(num1);

        int a = 10;
        double b = 2.5;

        /*
            double = int+double
            double = double+double
         */
        double sum = a+b;
        System.out.println(sum);
    }

}
