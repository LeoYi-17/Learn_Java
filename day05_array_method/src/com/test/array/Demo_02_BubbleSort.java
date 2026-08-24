//相邻两个元素比较大小,大的往后走,小的往前走->升序(冒泡排序)
package com.test.array;

public class Demo_02_BubbleSort {
    public static void main(String[] args) {
        int array[] = {5,1,2,3,7,9,8};
        int temp;
        // 外层循环：控制排序轮数，一共需要 array.length-1 轮比较
        for (int i = 0; i < array.length - 1; i++) {
        // 一轮里面，相邻元素两两比较、交换
            for (int j = 0; j < array.length - 1; j++) {
                // 判断：如果当前元素大于后一个元素，交换位置
                // 升序
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                // 降序
              /*  if (array[j] < array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }*/
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
