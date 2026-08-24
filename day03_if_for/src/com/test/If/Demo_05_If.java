/*案例：从键盘输入年份，请输出该年的2月份的总天数。闰年2月份29天，平年28天。
闰年:
a.能被4整除,但是不能被100整除
b.或者能直接被400整除  */
package com.test.If;

import java.util.Scanner;

public class Demo_05_If {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 ==0)){
            System.out.println("29天");
        }else {
            System.out.println("28天");
        }
    }
}
