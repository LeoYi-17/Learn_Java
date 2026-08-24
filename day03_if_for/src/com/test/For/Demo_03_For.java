//求1-100的偶数个数
package com.test.For;

public class Demo_03_For {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 ==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
