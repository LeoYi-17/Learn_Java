package IO流.字符流;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_01_FileOutputStream {
    public static void main(String[] args) throws IOException {
        //method01();
        //method02();
        method03();
    }
    @SneakyThrows
    public static void method01() throws FileNotFoundException {
        // 一次写一个字符
        FileOutputStream fileOutputStream = new FileOutputStream("D:/Users/LuYi/Desktop/IO/1.txt");
        fileOutputStream.write(97);
        fileOutputStream.close();
    }
    public static void method02() throws IOException {
        // 一次写一个数组
        FileOutputStream fileOutputStream = new FileOutputStream("D:/Users/LuYi/Desktop/IO/1.txt");
        byte []b = {97,98,99};
        fileOutputStream.write(b,0,3);
        fileOutputStream.close();
    }
    public static void method03() throws IOException {
        // 续写追加
        FileOutputStream fileOutputStream = new FileOutputStream("D:/Users/LuYi/Desktop/IO/1.txt", true);
        fileOutputStream.write("白日依山尽\n".getBytes());
        fileOutputStream.write("黄河入海流\n".getBytes());
        fileOutputStream.write("欲穷千里目\n".getBytes());
        fileOutputStream.write("更上一层楼\n".getBytes());
        fileOutputStream.close();
    }
}
