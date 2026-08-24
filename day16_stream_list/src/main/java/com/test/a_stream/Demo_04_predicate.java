package com.test.a_stream;

import java.util.function.Predicate;

public class Demo_04_predicate {
    public static void main(String[] args) {
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 3;
            }
        },"abc");
        System.out.println("——————————————————————————————");
        method(s -> s.length() == 3,"abc");
    }
    public static void method(Predicate <String> predicate,String s){
       boolean test = predicate.test(s);
        System.out.println(test);
    }
}
