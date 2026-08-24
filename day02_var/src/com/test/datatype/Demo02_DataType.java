package com.test.datatype;

public class Demo02_DataType {
    public static void main(String[] args) {
         /*
           2.5默认类型double
           a类型为int
           将2.5赋值给int型的a,相当于将取值范围大的类型赋值给取值范围小的类型
           需要强转
         */
        //int a = 2.5;
        int a = (int)2.5;
        System.out.println(a);

    }
}
