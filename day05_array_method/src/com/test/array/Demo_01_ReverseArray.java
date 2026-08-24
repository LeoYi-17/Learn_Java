//数组中对称位置上的元素互换
package com.test.array;

public class Demo_01_ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int temp;
        /*
         * for循环三部分：
         * 初始化：min指向最左边下标0，max指向最右边下标5
         * 循环条件：min < max  左边下标还没碰到右边下标，继续交换
         * 迭代表达式：min向右移(min++)，max向左移(max--)
         */
        for ( int min = 0,max = arr.length - 1; min <max;  max--,min++) {
                temp = arr[min];
                arr[min] = arr[max];
                arr[max] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
