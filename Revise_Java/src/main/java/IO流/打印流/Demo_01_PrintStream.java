package IO流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo_01_PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //method01();
        method02();
    }
    public static void method01() throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\Users\\LuYi\\Desktop\\IO\\print.txt");
        ps.println("床前明月光");
        ps.println("疑是地上霜");
        ps.println("举头望明月");
        ps.println("低头思故乡");
        ps.close();
    }
    public static void method02() throws FileNotFoundException {
        // 改变流向
        PrintStream ps = new PrintStream("D:\\Users\\LuYi\\Desktop\\IO\\log.txt");
        System.setOut(ps);
        System.out.println("出现了一个问题:NullPointerException");
        System.out.println("问题出现在代码的第10行");
        System.out.println("原因是字符串为null了");

    }
}
