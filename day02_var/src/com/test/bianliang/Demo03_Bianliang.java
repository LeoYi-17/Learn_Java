package com.test.bianliang;

public class Demo03_Bianliang {
    public static void main(String[] args) {
         /*
          \:在java中代表的是转义字符
          1.可以将具有特殊含义的字符转成普通字符
          2.将普通字符转义成具有特殊含义的字符
        */

        /*
          n:普通字符
          \n:换行
         */
        System.out.println("hello\nworld");

        /*
          t:普通字符
          \t:制表符  tab
         */
        System.out.println("hello\tworld");

        /*
           用字符串表示一个路径
           \:转义字符
           我们需要将具有特殊含义的\变成普通的\字符
         */
        String path = "F:\\jdk\\bin";
        System.out.println(path);
    }
}
