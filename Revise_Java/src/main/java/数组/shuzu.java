package 数组;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class shuzu {
    @Test
    public void test01(){
        // 遍历数组
        int num[] ={1,2,3,4,5,6,7,8};
        for (int i : num) {
            System.out.println(i);
        }
    }
    @Test
    public void test02(){
        // 获取数组最大值
        int num[]={234,24,565,342,2343,234324,999};
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println(max);
    }
    @Test
    public void test03(){
        // 随机产生10个[0,100]之间整数，统计既是3又是5，但不是7的倍数的个数
        int num[] = new int[10];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(101);
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i] % 3 == 0 && num[i] % 5 == 0 && num[i] % 7 != 0){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
       // test04();
        test06();
    }

    public static void test04(){
        // 用一个数组存储本组学员的姓名，从键盘输入，并遍历显示
        String[] stu = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5个学生的姓名");
        for (int i = 0; i < stu.length; i++) {
            stu[i] = scanner.next();
        }
        for (String s : stu) {
            System.out.println(s);
        }
    }
    @Test
    public void test05(){
        // 1.定义一个数组 int[] arr = {1,2,3,4}
        // 2.遍历数组,输出元素按照[1,2,3,4]
        int [] arr = {1,2,3,4};
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                s+=arr[i]+"]";
            }else {
                s+=arr[i]+",";
            }
        }
        System.out.println(s);
    }
    public static void test06(){
        // 键盘录入一个整数,找出整数在数组中存储的索引位置
        int [] num = {11,22,33,44,55,66};
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        int flag = 0;
        for (int i = 0; i < num.length; i++) {
            if(data == num[i]){
                System.out.println(i);
                flag++;
            }
        }
       if(flag == 0){
           System.out.println("输入的整数不在数组中");
       }
    }
    @Test
    public void test07(){
        // 定义一个数组,存储1,2,3,将其扩容到长度为5
        int num[] = {1,2,3};
        int extend[] = new int[5];
        for (int i = 0; i < num.length; i++) {
            extend[i] =num[i];
        }
        num = extend;
        for (int i = 0; i < extend.length; i++) {
            System.out.println(num[i]);
        }
    }
    @Test
    public void test08(){
        // 数组中对称位置上的元素互换
        int[]num = {1,2,3,4,5,6};
        int temp;
        for (int min = 0, max = num.length - 1; min < max; min++,max--) {
            temp = num[min];
            num[min] = num[max];
            num[max] = temp;
        }
        for (int i : num) {
            System.out.println(i);
        }
    }
    @Test
    public void test09(){
        // 冒泡排序
        // 相邻两个元素比较大小,大的往后走,小的往前走->升序
        int num[]={10,9,8,7,6,5};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                 if(num[j] >num[j+1]){
                     int temp = num[j];
                     num[j] = num[j+1];
                     num[j+1] = temp;
                 }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    @Test
    public void test10(){
        // 二分查找
        int num[]={1,2,3,4,5,6,7,8,9,10};
        int max = num.length - 1;
        int min = 0;
        int mid = 0;
        int key = 10;
        while (min <= max){
           mid = (max + min) / 2;
           if(key > num[mid]){
               min = mid + 1;
           }else if(key < num[mid]){
               max = mid - 1;
           }else {
               System.out.println("找到了,索引是:"+mid);
               break;
           }
        }
    }
    @Test
    public void test11(){
        // 二维数组遍历
        int[][] num = new int[3][3];
        num[0][0] = 100;
        num[0][1] = 200;
        num[0][2] = 300;

        num[1][1] = 2000;
        num[1][0] = 1000;
        num[1][2] = 3000;

        num[2][0] = 10000;
        num[2][1] = 20000;
        num[2][2] = 30000;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.println(num[i][j]);
            }
        }
    }
    @Test
    public void test12(){
        // Arrays类遍历数组
        int num[] ={1,2,3,4,5,6,8,7,9};
        System.out.println(Arrays.toString(num));
        System.out.println("——————————————————————————————————");
        // Arrays进行数组升序排序
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("——————————————————————————————————");
        // Arrays进行数组二分查找
        int index = Arrays.binarySearch(num,9);
        System.out.println(index);
        System.out.println("——————————————————————————————————");
        // Arrays进行数组扩容
        int extend[] = Arrays.copyOf(num,15);
        num = extend;
        System.out.println(Arrays.toString(num));
    }
}
