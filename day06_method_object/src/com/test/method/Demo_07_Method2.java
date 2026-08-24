// 数组作为返回值返回
package com.test.method;

import java.util.Arrays;

public class Demo_07_Method2 {
    public static void main(String[] args) {
        int result[] = method(10,20);
        System.out.println(Arrays.toString(result));
    }
    public static int[] method(int a,int b){
        int sum = a + b;
        int sub = a - b;
        int arr[]={sum,sub};
        return arr;
    }
}
