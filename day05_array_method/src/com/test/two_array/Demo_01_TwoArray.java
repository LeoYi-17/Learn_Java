package com.test.two_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo_01_TwoArray {
    public static void main(String[] args) {
        //动态初始化
        int[][] arr1 = new int[3][3];
        //如果没有指定一维数组长度,相当于一维数组没有被创建
        int[][] arr2 = new int[3][];
        //静态初始化
        int[][] arr3 = {{1,2,3},{4,5,6},{7,8,9}};
        String[][] arr4 = {{"唐僧","孙悟空","猪八戒"},{"刘备","关羽"}};
    }

}
