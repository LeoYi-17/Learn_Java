package IO流.字节流;

import java.io.FileWriter;
import java.io.IOException;

public class Demo_01_FileWriter {
    public static void main(String[] args) throws IOException {
        method01();
    }
    public static void method01() throws IOException {
        // 一次写一个字符串
        FileWriter fileWriter = new FileWriter("D:\\Users\\LuYi\\Desktop\\IO\\3.txt", true);
        fileWriter.append("白日依山尽，\n");
        fileWriter.append("黄河入海流。\n");
        fileWriter.append("欲穷千里路，\n");
        fileWriter.append("更上一层楼。\n");
        //fileWriter.flush();
        fileWriter.close();
    }
}
