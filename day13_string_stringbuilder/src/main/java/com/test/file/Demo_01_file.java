package com.test.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Demo_01_file {
    @Test
    public void test1() {
        // 与系统有关的路径分隔符 ;
        String pathSeparator = File.pathSeparator;
        System.out.println("pathSeparator = " + pathSeparator);
        // 与系统有关的路径名称分隔符 \
        String separator = File.separator;
        System.out.println("separator = " + separator);

        //写一个正确的路径
        //String path = "F:\\idea\\io";
        String path = "F:"+File.separator+"idea"+File.separator+"io";
        System.out.println(path);
    }
    @Test
    public void test2() {
        File file = new File("C:\\Users\\LuYi\\Pictures\\408059eb088a4d1c8f5eca3feeb41b9e.jpg");
        System.out.println(file);
    }
    @Test
    public void test3() {
        File file = new File("C:\\Users\\LuYi\\Pictures\\408059eb088a4d1c8f5eca3feeb41b9e.jpg");
        //String getAbsolutePath() -> 获取File的绝对路径->带盘符的路径
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);
        //String getPath() ->获取的是封装路径->new File对象的时候写的啥路径,获取的就是啥路径
        String path = file.getPath();
        System.out.println("path = " + path);
        //String getName()  -> 获取的是文件或者文件夹名称
        String name = file.getName();
        System.out.println("name = " + name);
        //long length() -> 获取的是文件的长度 -> 文件的字节数
        long length = file.length();
        System.out.println("length = " + length);
    }
    @Test
    public void test4() throws IOException {
        File file = new File("C:\\Users\\LuYi\\Pictures\\1.txt");
        //boolean createNewFile()  -> 创建文件
        //如果要创建的文件之前有,创建失败,返回false
        //如果要创建的文件之前没有,创建成功,返回true
        System.out.println(file.createNewFile());


        File file1 = new File("C:\\Users\\LuYi\\Pictures\\heihei\\haha");
        //boolean mkdirs() -> 创建文件夹(目录)既可以创建多级文件夹,还可以创建单级文件夹
        //如果要创建的文件夹之前有,创建失败,返回false
        //如果要创建的文件夹之前没有,创建成功,返回true
        System.out.println(file1.mkdirs());
    }
    @Test
    public void test5() {
        File file1 = new File("C:\\Users\\LuYi\\Pictures\\1.txt");
        System.out.println(file1.delete());
        File file2 = new File("C:\\Users\\LuYi\\Pictures\\heihei");
        System.out.println(file2.delete());
    }
    @Test
    public void test6() {
        File file = new File("C:\\Users\\LuYi\\Pictures\\408059eb088a4d1c8f5eca3feeb41b9e.jpg");
        //boolean isDirectory() -> 判断是否为文件夹
        System.out.println(file.isDirectory());
        //boolean isFile()  -> 判断是否为文件
        System.out.println(file.isFile());
        //boolean exists()  -> 判断文件或者文件夹是否存在
        System.out.println(file.exists());
    }
    @Test
    public void test7() {
        File file = new File("C:\\Users\\LuYi\\Pictures");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
