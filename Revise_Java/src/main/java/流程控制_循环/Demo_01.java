package 流程控制_循环;

import java.util.Scanner;

public class Demo_01 {
    public static void main(String[] args) {
            //method01();
            //method02();
            //method03();
            //method04();
            //method05();
            //method06();
            method07();
    }


    public static void method01(){
        // 任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数
        System.out.println("请输入一个数");
        Scanner scanner = new Scanner(System.in);
        int data =scanner.nextInt();

        if (data % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
    public static void method02(){
        // 利用if..else 求出两个数的较大值
        System.out.println("请输入两个数");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner1.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }
    public static void method03(){
        // 利用if..else 求出三个数的较大值
        System.out.println("请输入三个数");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int temp = 0;

        if(num1 > num2){
            temp = num1;
        }else {
            temp = num2;
        }
        if(temp > num3){
            temp = num3;
            System.out.println(temp);
        }else{
            System.out.println(num3);
        }
    }
    public static void method04(){
        // 从键盘输入年份，请输出该年的2月份的总天数。闰年2月份29天，平年28天。
        // 闰年:
        // a.能被4整除,但是不能被100整除
        // b.或者能直接被400整除
        System.out.println("请输入年份");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((num % 4 == 0 && num % 100 != 0)|| num % 400 == 0){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
    }
    public static void method05(){
        // 求1-3的和
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void method06(){
        // 求1-100的偶数和
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 ==0){
                count += i;
            }
        }
        System.out.println(count);
    }
    public static void method07(){
        // 统计1-100的偶数个数
        int count = 0;
        for (int i = 1; i <= 101; i++) {
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
