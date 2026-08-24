package com.test.print_stream;

import java.io.PrintStream;

public class Demo_01_print_stream {
    public static void main(String[] args) throws Exception {
        //method01();
        method02();
    }
    private static void method01()throws Exception {
        PrintStream ps = new PrintStream("day14_io/print.txt");
        ps.println("床前明月光");
        ps.println("疑是地上霜");
        ps.println("举头望明月");
        ps.println("低头思故乡");
        ps.close();
    }
    private static void method02()throws Exception {
        PrintStream ps = new PrintStream("day14_io/log.txt");

        //改变流向
        System.setOut(ps);

        System.out.println("出现了一个问题:NullPointerException");
        System.out.println("问题出现在代码的第10行");
        System.out.println("原因是字符串为null了");
    }
}
