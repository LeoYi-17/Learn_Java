package com.test.method;

import java.util.function.Function;

public class Demo_04_method {
    public static void main(String[] args) {
        method(new Function<String, Person>() {

            /**
             * apply:是重写方法,参数为String,返回值为Person
             * Person中的有参构造:参数为String,返回值可以看成是Person类型
             * @param s
             * @return
             */
            @Override
            public Person apply(String s) {
                //return new Person("张三")
                return new Person(s);
            }
        },"张三");

        System.out.println("=====================");
        method(Person::new,"张三");
    }
    public static void method(Function<String,Person> function, String name){
        Person person = function.apply(name);
        System.out.println(person);
    }
}
