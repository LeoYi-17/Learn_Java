package com.test.a_stream;

import java.util.function.Consumer;

public class Demo_02_consumer {
    public static void main(String[] args) {
        method(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        },"abcd");

        System.out.println("——————————————————————————————————");

        method(s -> System.out.println(s.length()),"abcd");
    }
    public static void method(Consumer <String> consumer,String s){
        consumer.accept(s);
    }
}
