//在main方法中定义一个数组,将数组传递到方法中,在此方法中遍历数组
//在main方法中定义数组,传递到另外一个方法中,在此方法中实现获取数组最大值
package com.test.method;

import cn.hutool.core.util.ArrayUtil;

import java.util.Arrays;

public class Demo_05_Method2 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        method1(arr);
        method2(arr);
        method3(arr);
    }
    public static void method1(int array[]){
        System.out.println(Arrays.toString(array));
    }
    public static void method2(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void method3(int array[]){
        System.out.println(ArrayUtil.max(array));
    }
}
