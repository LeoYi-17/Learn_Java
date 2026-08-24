/* 1.定义一个数组 int[] arr = {1,2,3,4}
   2.遍历数组,输出元素按照[1,2,3,4]*/
package com.test.method;
import java.util.Arrays;

public class Demo_06_Method2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        method(arr);
    }
    public static void method(int array[]){
        System.out.println(Arrays.toString(array));
    }
}
