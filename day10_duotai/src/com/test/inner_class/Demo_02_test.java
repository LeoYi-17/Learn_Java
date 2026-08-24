package com.test.inner_class;

public class Demo_02_test {
    public static void main(String[] args) {
        Students.Inner inner = new Students().new Inner();
        inner.display();
    }
}
