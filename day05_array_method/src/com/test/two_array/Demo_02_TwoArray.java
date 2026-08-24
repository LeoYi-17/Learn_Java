package com.test.two_array;

public class Demo_02_TwoArray {
    public static void main(String[] args) {
        //动态初始化
        int[][] arr1 = new int[3][3];
        //获取二维数组长度
        System.out.println(arr1.length);
        //获取二维数组中每一个一维数组长度
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i].length + "");
        }
    }
}
