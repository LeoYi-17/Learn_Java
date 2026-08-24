// 求1-100的和
package com.test.method;

public class Demo_03_Method2 {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        int count = 0;
        for (int i = 0; i < 101; i++) {
            count+=i;
        }
        return count;
    }
}
