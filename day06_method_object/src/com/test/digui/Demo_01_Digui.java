//递归输出3到1
package com.test.digui;

public class Demo_01_Digui {
    public static void main(String[] args) {
        method(3);
    }
    public static void method(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        n--;
        method(n);
    }
}
