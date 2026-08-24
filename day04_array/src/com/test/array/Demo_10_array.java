//定义一个数组,存储1,2,3,将其扩容到长度为5
package com.test.array;

public class Demo_10_array {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = new int[5];
        //将arr1中的元素放到arr2中
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        //将arr2的地址值给arr1
        arr1 = arr2;
        // 遍历arr1所有元素
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
