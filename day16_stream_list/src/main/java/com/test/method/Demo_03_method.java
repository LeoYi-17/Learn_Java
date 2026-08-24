package com.test.method;

import java.util.function.Supplier;

public class Demo_03_method {
    public static void main(String[] args) {
        method(new Supplier<Double>() {
            /**
             * get:是重写方法,无参,返回值类型为Double
             * random:
             * @return
             */
            @Override
            public Double get() {
                return Math.random();
            }
        });
        System.out.println("===================");
        method(Math::random);
    }

    public static void method(Supplier<Double> supplier) {
        Double result = supplier.get();
        System.out.println(result);
    }
}
