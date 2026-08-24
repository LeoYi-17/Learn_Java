package com.test.output_input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo_03_copy {
    public static void main(String[] args) throws Exception{
        //1.创建FileInputStream用于将本地上的图片读到内存中
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LuYi\\Pictures\\408059eb088a4d1c8f5eca3feeb41b9e.jpg");
        //2.创建FileOutputStream用于将内存中的图片写出到磁盘中
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\LuYi\\Pictures\\spiderman.jpg");
        //3.创建数组,数组长度一般都是1024或者其倍数
        byte[] bytes = new byte[1024];
        //4.边读边写
        int len = 0;
        while ((len = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        //5.关流->先开的后关
        fileOutputStream.close();
        fileInputStream.close();

    }
}
