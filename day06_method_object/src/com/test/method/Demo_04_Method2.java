// 定义一个方法,给这个方法传几,
// 就让这个方法循环打印几次"我是一个有经验的JAVA+智能体开发工程师"
package com.test.method;

public class Demo_04_Method2 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int data){
        for (int i = 0; i < data; i++) {
            System.out.println("我是一个有经验的JAVA+智能体开发工程师");
        }
    }
}
