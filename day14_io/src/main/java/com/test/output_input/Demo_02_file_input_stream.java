package com.test.output_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo_02_file_input_stream {
    public static void main(String[] args) throws Exception {
        //method01();
        method02();
    }

    private static void method01() throws IOException {
        /*
         * 一次读一个字节,返回读取的字节
         */
        FileInputStream fis = new FileInputStream("day14_io/2.txt");
        /*int data1 = fis.read();
        System.out.println(data1);
        int data2 = fis.read();
        System.out.println(data2);
        int data3 = fis.read();
        System.out.println(data3);*/
        int len =0;
        while ((len = fis.read())!=-1){
            System.out.println((char)len);
        }
        fis.close();
    }
    /**
     * 一次读一个字节数组
     * @throws Exception
     */
    private static void method02()throws Exception {
        FileInputStream fis = new FileInputStream("day14_io/2.txt");
        /*
          数组相当于一个临时存储区域,数组定多长,每次就读取多少个数据
          我们读取的数据会先保存到数组中,然后我们从数组中读取数据
          如果剩下的数据不够数组长度了,那么剩下多少个数据就一次读多少个数据
         */
        byte[] bytes = new byte[2];

/*      int len1 = fis.read(bytes);
        System.out.println(len1);

        int len2 = fis.read(bytes);
        System.out.println(len2);

        int len3 = fis.read(bytes);
        System.out.println(len3);*/

        //定义一个变量,接收读取的字节个数
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }

}
