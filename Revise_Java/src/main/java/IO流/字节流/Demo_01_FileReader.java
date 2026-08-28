package IO流.字节流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo_01_FileReader {
    public static void main(String[] args) throws IOException {
        //method01();
        method02();
    }
    public static void method01() throws IOException {
        // 一次读一个字符
        FileReader fileReader = new FileReader("D:\\Users\\LuYi\\Desktop\\IO\\2.txt");
        int len = 0;
        while ((len = fileReader.read()) != -1){
            System.out.println((char) len );
        }
        fileReader.close();
    }
    public static void method02() throws IOException {
        // 一次读一个字符数组
        FileReader fileReader = new FileReader("D:\\Users\\LuYi\\Desktop\\IO\\2.txt");
        char[] chars = new char[1];
        int len = 0;
        while ((len = fileReader.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
    }
}
