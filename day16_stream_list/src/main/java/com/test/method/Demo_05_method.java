package com.test.method;

import java.util.function.Function;

public class Demo_05_method {
    public static void main(String[] args) {
        method(new Function<Integer, int[]>() {
            /**
             * apply:是重写方法,参数为Integer,返回值为int[]
             * 将数组的长度看成是方法参数,返回值为int[]
             *
             * @param len the function argument
             * @return
             */
            @Override
            public int[] apply(Integer len) {
                return new int[len];
            }
        },10);
        System.out.println("=====================");
        method(int[]::new,10);
    }
    public static void method(Function<Integer,int[]> function,int len){
        int[] arr = function.apply(len);
        System.out.println(arr.length);
    }
}
