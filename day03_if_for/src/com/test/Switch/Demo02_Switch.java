package com.test.Switch;

import java.util.Scanner;

public class Demo02_Switch {
    public static void main(String[] args) {
        System.out.println("请输入月份");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case 1,2,3:
                System.out.println("春季");
                break;
            case 4,5,6:
                System.out.println("夏季");
                break;
            case 7,8,9:
                System.out.println("秋季");
                break;
            case 10,11,12:
                System.out.println("冬季");
                break;
        }
    }
}
