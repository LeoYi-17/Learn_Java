//获取数组最大值
package com.test.array;

public class Demo_04_array {
    public static void main(String[] args) {
      int info[] = {1,2,3,4,5,67,787,979,12,12321,12323};
      int max = info[0];
        for (int i = 1; i < info.length; i++) {
            if (max < info[i]){
                max = info[i];
            }
        }
        System.out.println(max);
    }
}
