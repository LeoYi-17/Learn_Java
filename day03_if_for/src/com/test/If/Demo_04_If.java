// 比较三个数的最大值
package com.test.If;

import java.util.Scanner;

public class Demo_04_If {
    public static void main(String[] args) {
        System.out.println("请输入三个数");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int temp=0;
        // 第一步：先对比 num1 和 num2，把更大的值放进 temp
        if(num1>num2){
            temp =num1;
        }else{
            temp = num2;
        }
        // 第二步：拿【两个数的最大值temp】和第三个数num3对比
        if (temp>num3){
            System.out.println(temp+"大");
        }else {
            System.out.println(num3+"大");
        }


    }
}
