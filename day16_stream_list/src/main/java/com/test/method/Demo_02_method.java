package com.test.method;

import java.util.function.Supplier;

public class Demo_02_method {
    public static void main(String[] args) {
        method(new Supplier<String>() {
            /**
             * get:是重写的方法,无参,返回值类型为String
             * trim:无参,返回值类型为String
             * @return
             */
            @Override
            public String get() {
                return " abcdefg ".trim();
            }
        });
        System.out.println("=====================");
        method(" abcdefg "::trim);
    }

    public static void method(Supplier<String> supplier) {
        String result = supplier.get();
        System.out.println(result);
    }
}
