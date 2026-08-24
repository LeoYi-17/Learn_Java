package com.test.reader_writer;

import java.io.FileReader;

public class Demo_01_reader {
    public static void main(String[] args) throws Exception {
      //method01();
      method02();
    }
    /**
     * 一次读一个字符
     * @throws Exception
     */
    public static void method01()throws Exception {
        FileReader fr = new FileReader("day14_io/3.txt");
        int len = 0;
        while((len = fr.read())!=-1){
            System.out.println((char)len);
        }
        fr.close();
    }
    /**
     * 一次读一个字符数组
     * @throws Exception
     */
    private static void method02()throws Exception{
        FileReader fr = new FileReader("day14_io/3.txt");
        char[] chars = new char[1024];
        int len = 0;
        while((len = fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
