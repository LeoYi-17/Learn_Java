//任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，
// 并在控制台输出该整数是奇数还是偶数
package com.test.If;

import java.util.Scanner;

public class Demo02_If {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num %2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}
