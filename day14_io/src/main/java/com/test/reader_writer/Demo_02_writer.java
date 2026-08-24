package com.test.reader_writer;

import java.io.FileWriter;

public class Demo_02_writer {
    public static void main(String[] args) throws Exception {
        method01();
    }
    private static void method01() throws Exception {
        FileWriter fw = new FileWriter("day14_io/4.txt",true);
        fw.write("风萧萧兮易水寒\r\n");
        fw.write("壮士一去兮不复还\r\n");
        //fw.flush();
        fw.close();
    }
}
