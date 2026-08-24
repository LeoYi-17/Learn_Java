package com.test.exception;

public class Demo_01_throw_new {
    public static void main(String[] args) {
        String s = "abc.txt1";
        insert(s);
        System.out.println("哈哈哈哈哈");

    }

    /**
     * 用到了一个String类中的方法:
     *   boolean endsWith(String str)
     *   判断字符串是否以指定的串儿结尾
     *   比如: "abc.txt".endsWith(".txt") -> true
     * @param s
     */
    public static void insert(String s) {
        if (!s.endsWith(".txt")){
            throw new NullPointerException();
        }
        System.out.println("呵呵呵呵");
    }
}

