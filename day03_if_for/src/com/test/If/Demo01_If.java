package com.test.If;

import java.util.Scanner;

public class Demo01_If {
    public static void main(String[] args) {
        System.out.println("请输入一个数,判断这个数比10大还是比10小");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 10){
            System.out.println(num+"比10大");
        } else if (num < 10) {
            System.out.println(num+"比10小");
        }else {
            System.out.println(num+"和10相等");
        }
    }
}
