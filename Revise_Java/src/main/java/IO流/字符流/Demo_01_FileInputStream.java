package IO流.字符流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_01_FileInputStream {
    public static void main(String[] args) throws IOException {
        //method01();
        //method02();
        method03();
    }
    public static void method01() throws IOException {
        // 一次读一个字节,返回读取的字节
        FileInputStream fileInputStream = new FileInputStream("D:/Users/LuYi/Desktop/IO/2.txt");
        int len = 0;
        while ((len = fileInputStream.read()) != -1){
            System.out.println((char)len);
        }
        fileInputStream.close();
    }
    public static void method02() throws IOException {
        // 一次读一个字节数组
        FileInputStream fileInputStream = new FileInputStream("D:/Users/LuYi/Desktop/IO/2.txt");
        byte bytes[] = new byte[1];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,1) );
        }
        fileInputStream.close();
    }
    public static void method03() throws IOException {
        // 图片复制
        FileInputStream fis = new FileInputStream("C:\\Users\\LuYi\\Pictures\\loki-the-trickster-god-nw-3840x2400.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Users\\LuYi\\Desktop\\IO\\loki.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
