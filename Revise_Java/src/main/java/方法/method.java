package 方法;

import cn.hutool.core.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int data = scanner.nextInt();
        System.out.println(method01(data));
        System.out.println("——————————————————————————————————");
        int method02 =method02();
        System.out.println(method02);
        System.out.println("——————————————————————————————————");
        method03(5);
        System.out.println("——————————————————————————————————");
        int arr1[]={1,2,3,4,5,6};
        metho04(arr1);
        System.out.println("——————————————————————————————————");
        int num1[] ={1,4,5,567,45,34,234,767};
        method05(num1);
        System.out.println("——————————————————————————————————");
        int[] arr = {1,2,3,4};
        method06(arr);
        System.out.println("——————————————————————————————————");
        method07(3);
        System.out.println("——————————————————————————————————");
        int result = method08(3);
        System.out.println(result);
        System.out.println("——————————————————————————————————");
        int result2 = method09(12);
        System.out.println(result2);
    }
    // 键盘录入一个整数,将整数传递到另外一个方法中,在此方法中判断这个整数的奇偶性
    // 如果是偶数,方法返回"偶数"  否则返回"奇数"
    public static String method01(int data){
        if (data % 2 == 0){
            return "偶数";
        }else {
            return "奇数";
        }
    }
    // 求出1-100的和,并将结果返回
    public static int method02(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
    // 定义一个方法,给这个方法传几,就让这个方法循环打印几次"我是一个有经验的JAVA+智能体开发工程师"
    public static void method03(int count){
        for (int i = 0; i < count; i++) {
            System.out.println("我是一个有经验的JAVA+智能体开发工程师");
        }
    }
    // 在main方法中定义一个数组,将数组传递到方法中,在此方法中遍历数组
    public static void metho04(int arr2[]){
        System.out.println(Arrays.toString(arr2));
    }
    // 在main方法中定义数组,传递到另外一个方法中,在此方法中实现获取数组最大值
    public static void method05(int arr[]){
        System.out.println(ArrayUtil.max(arr));
    }
    //  1.定义一个数组 int[] arr = {1,2,3,4}
    //  2.遍历数组,输出元素按照[1,2,3,4]
    public static void method06(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    // 用递归输出3到1
    public static void method07(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        n --;
        method07(n);
    }
    // 求n!
    public static int method08(int n){
        if(n == 1){
            return 1;
        }else {
            return n * method08(n - 1);
        }
    }
    // 计算斐波那契数列
    public static int method09(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            return method09(n - 1) + method09(n - 2);
        }
    }
}
