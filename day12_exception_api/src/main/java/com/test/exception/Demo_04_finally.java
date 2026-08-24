package com.test.exception;

import java.io.FileNotFoundException;

public class Demo_04_finally {
    public static void main(String[] args) {
        String s = "abc.txt1";
        try {
            String str = null;
            System.out.println(str.length());//空指针异常
            insert(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();//打印详细的异常信息
        }finally {
            System.out.println("我一定会执行的");
        }
        System.out.println("删除功能");
        System.out.println("修改功能");
        System.out.println("查询功能");

    }
    public static void insert(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")){
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("呵呵呵呵");
    }
}
