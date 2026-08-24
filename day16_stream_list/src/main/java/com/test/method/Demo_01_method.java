package com.test.method;

import org.junit.Test;

import java.util.stream.Stream;

public class Demo_01_method {
    @Test
    public void test01() {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七", "朱八");
        /*stream.forEach(new Consumer<String>() {
         *//**
         * accpet是重写的方法,而且是有一个String类型参数还有无返回值的方法
         * println方法在accept中被调用,它是一个有一个String类型参数的而且无返回值的方法
         *
         * 可以在accept中引用println方法
         *//*
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        stream.forEach(System.out::println);
    }
}