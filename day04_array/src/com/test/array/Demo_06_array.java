//随机产生10个[0,100]之间整数，统计既是3又是5，但不是7的倍数的个数
package com.test.array;

import java.util.Random;

public class Demo_06_array {
    // 创建长度为10的数组以及Random对象以及统计的count变量
    public static void main(String[] args) {
        Random ra = new Random();
        int info[] = new int[10];
        int count = 0;
        // 产生10个随机数放到数组中
        for (int i = 0; i < info.length; i++) {
            info[i] = ra.nextInt(101);
        }
        // 遍历数组，在遍历的过程中判断，符合条件的count++
        for (int i = 0; i < info.length; i++) {
            if (info[i] % 3 == 0 && info[i] % 5 == 0 && info[i] % 7 != 0 ){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
