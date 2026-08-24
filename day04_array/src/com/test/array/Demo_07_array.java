//用一个数组存储本组学员的姓名，从键盘输入，并遍历显示
package com.test.array;

import java.util.Scanner;

public class Demo_07_array {
    public static void main(String[] args) {
        String info[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个学生姓名");
        //先循环输入
        for (int i = 0; i < info.length; i++) {
           info[i] = sc.next();
        }
        //再循环输出
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
    }
}
