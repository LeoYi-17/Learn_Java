package com.test.output_input;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo_01_file_output_stream {
    public static void main(String[] args) throws IOException {
        //method1();
        //method2();
        //method3();
        //method4();
          method5();
    }

    private static void method1() throws IOException {
        /**
         * 一次写一个字节
         */
        FileOutputStream fos = new FileOutputStream("day14_io/1.txt");
        fos.write(97); // 将97字节翻译成字符a
        fos.close();
    }

    private static void method2() throws IOException {
        /**
         * 一次写一个字节数组
         */
        FileOutputStream fos = new FileOutputStream("day14_io/1.txt");
        byte[] bytes = {97,98,99,100};
        fos.write(bytes);
        fos.close();
    }
    private static void method3() throws IOException {
        /**
         * 一次写一个字节数组一部分
         */
        FileOutputStream fos = new FileOutputStream("day14_io/1.txt");
        byte[] bytes = {97,98,99,100};
        fos.write(bytes,0,2);
        fos.close();
    }
    private static void method4() throws IOException {
        /**
         * 写一个字节数组(中文)
         */
        FileOutputStream fos = new FileOutputStream("day14_io/1.txt");
        byte[] bytes = "我爱中国".getBytes();
        fos.write(bytes);
        fos.close();
    }
    private static void method5() throws IOException {
        /**
         * 续写追加
         */
        FileOutputStream fos = new FileOutputStream("day14_io/1.txt",true);
        fos.write("白日依山尽\r\n".getBytes());
        fos.write("黄河入海流\r\n".getBytes());
        fos.write("欲穷千里目\r\n".getBytes());
        fos.write("更上一层楼\r\n".getBytes());
        fos.close();
    }
}
