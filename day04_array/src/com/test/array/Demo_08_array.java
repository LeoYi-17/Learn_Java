// 1.定义一个数组 int[] arr = {1,2,3,4}
// 2.遍历数组,输出元素按照[1,2,3,4]
package com.test.array;

public class Demo_08_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.print(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }

        }
    }
}
