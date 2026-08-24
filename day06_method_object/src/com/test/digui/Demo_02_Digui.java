//求3的阶乘
package com.test.digui;

public class Demo_02_Digui {
    public static void main(String[] args) {
        int result = method(3);
        System.out.println(result);
    }
    public static int method(int n){
        if (n == 1){
            return 1;
        }
        return n * method(n - 1);

    }

}
