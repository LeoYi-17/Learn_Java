//和电脑猜数字游戏
package com.test.random;

import java.util.Random;
import java.util.Scanner;


public class Demo_02_random {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int Computernum = ra.nextInt(10) + 1;
        while (true){
            int Playernum = sc.nextInt();
            if (Playernum > Computernum){
                System.out.println("玩家赢了,电脑出的"+Computernum);
            } else if (Playernum < Computernum) {
                System.out.println("电脑赢了,电脑出的"+Computernum);
            }else {
                System.out.println("平局,电脑出的"+Computernum);
            }
            break;
        }
    }

}
