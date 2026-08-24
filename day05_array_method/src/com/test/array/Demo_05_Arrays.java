package com.test.array;

import java.util.Arrays;

public class Demo_05_Arrays {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        // String toString(数组) 按照[元素1,元素2...]格式打印
        System.out.println(Arrays.toString(array));
        // void sort(数组)数组升序排序
        int array2[] = {213,12,34,56,77,88,7};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        // int binarySearch(数组,要查找的元素)二分查找,返回元素对应的索引
        int index = Arrays.binarySearch(array,4);
        System.out.println(index);
        // int[] copyOf(数组,新数组长度)数组扩容,返回新数组
        int[] copy = Arrays.copyOf(array2,8);
        array2 = copy;
        System.out.println(Arrays.toString(array2));
    }
}
