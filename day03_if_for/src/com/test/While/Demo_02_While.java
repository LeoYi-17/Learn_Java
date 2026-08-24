// 求1-100偶数和
package com.test.While;

public class Demo_02_While {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i <= 100){
            if(i % 2 ==0){
               count += i;
            }
            i++;
        }
        System.out.println(count);
    }
}
