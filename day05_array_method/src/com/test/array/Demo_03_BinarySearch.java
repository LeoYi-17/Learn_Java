// 二分查找
package com.test.array;

public class Demo_03_BinarySearch {
    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6};
        int min = 0; // 查找范围最左边下标
        int max = array.length - 1; // 查找范围最右边下标
        int mid = 0;  // 中间下标
        int key = 6;  // 我们要找的数字
        // 只要左边边界 ≤ 右边边界，说明区间还有数字，可以继续查找
        while (min <= max){
            // 算出当前区间中间位置
            mid = (max + min) / 2;
            // 要找的值 > 中间位置的数
            if(key > array[mid]){
                // 目标一定在【右边】,向右+1位
                min = mid + 1;
                // 要找的值 < 中间位置的数
            }else if(key < array[mid]){
                // 目标一定在【左边】,向左-1位
                max = mid - 1;
            }else {
                // key == array[mid]，找到了
                System.out.println("索引是"+mid);
                break;
            }
        }
    }
}
