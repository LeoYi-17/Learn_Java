package com.test.Scanner;

import java.util.Scanner;

public class Demo01_Scanner {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);
        // 录入一个整数
        int data = sc.nextInt();
        System.out.println(data+1);
        // 录入一个字符串
        String data2 = sc.next();
        System.out.println(data2+1);
    }
}
