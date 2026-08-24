// 比较两个数最大值
package com.test.If;

import java.util.Scanner;

public class Demo03_If {
    public static void main(String[] args) {
        System.out.println("请输入两个数");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();

        if(num1>num2){
            System.out.println(num1+"大");
        }else {
            System.out.println(num2+"大");
        }


    }
}
