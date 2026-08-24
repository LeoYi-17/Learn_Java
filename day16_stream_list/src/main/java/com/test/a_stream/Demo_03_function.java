package com.test.a_stream;

import java.util.function.Function;

public class Demo_03_function {
    public static void main(String[] args) {
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        },34);
        System.out.println("——————————————————————————————————————————");
        method(integer-> integer+"",34);
    }
    public static void method(Function <Integer,String> function,int age){
        String s = function.apply(age);
        System.out.println(s+1);
    }
}
