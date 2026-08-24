package com.test.reader_writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo_03_reader_writer_exception {
    public static void main(String[] args) throws IOException {
        //method01();
        method02();
    }
    private static void method01() throws IOException {
        FileWriter fw = new FileWriter("day14_io/4.txt",true);
        try (fw){
            fw.write("我爱我的祖国111");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void method02() {
        try(FileWriter fw = new FileWriter("day14_io/4.txt")){
            fw.write("我爱我的祖国");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
