/*需求:
键盘录入一个星期数(1,2,...7)，输出对应的星期一，星期二，...星期日

输入  1      输出	星期一
输入  2      输出	星期二
输入  3      输出	星期三
输入  4      输出	星期四
输入  5      输出	星期五
输入  6      输出	星期六
输入  7      输出	星期日
输入  其它数字   输出      数字有误*/

package com.test.If;

import java.util.Scanner;

public class Demo_06_If {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("星期一");
        } else if (num == 2) {
            System.out.println("星期二");
        }else if (num == 3) {
            System.out.println("星期三");
        }else if (num == 4) {
            System.out.println("星期四");
        }else if (num == 5) {
            System.out.println("星期五");
        }else if (num == 6) {
            System.out.println("星期六");
        }else if (num == 7) {
            System.out.println("星期日");
        }else {
            System.out.println("数字有误");
        }
    }
}
