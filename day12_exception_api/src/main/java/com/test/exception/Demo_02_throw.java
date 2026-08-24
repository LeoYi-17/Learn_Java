package com.test.exception;

import java.io.FileNotFoundException;

public class Demo_02_throw {
    public static void main(String[] args) throws FileNotFoundException{
        String s = "abc.txt1";
        insert(s);
        System.out.println("哈哈哈哈哈");

    }


    public static void insert(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")){
            throw new NullPointerException();
        }
        System.out.println("呵呵呵呵");
    }
}

