package com.test.a_stream;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo_01_stream {
    public static void main(String[] args) {
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int arr[] = {5,45,78,98,56,35};
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
        });
        System.out.println("——————————————————————————————");
        method(() -> {
            int arr[] = {5, 45, 78, 98, 56, 35};
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });
    }
    public static void method(Supplier<Integer> supplier){
        System.out.println(supplier.get());
    }
}
