//获取数组的个数
package com.test.array;

public class Demo_05_array {
    public static void main(String[] args) {
        int info[] = {100,343,121,132,678,2342,2131};
        int count = 1;
        for (int i = 1; i < info.length; i++) {
            if (i < info[i]){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
