/*需求: 小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，
假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
奖励规则:
95~100		山地自行车一辆
90~94		游乐场玩一次
80~89		变形金刚玩具一个
80以下	    胖揍一顿*/
package com.test.If;

import java.util.Scanner;

public class Demo_07_If {
    public static void main(String[] args) {
        System.out.println("请输入成绩");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 95 && num <= 100){
            System.out.println("山地自行车一辆");
        } else if (num >= 90 && num <= 94) {
            System.out.println("游乐场玩一次");
        }else if (num >= 80 && num <= 89) {
            System.out.println("变形金刚玩具一个");
        }else if (num >= 0 && num <= 79) {
            System.out.println("胖揍一顿");
        }else {
            System.out.println("成绩不合理");
        }
    }
}
