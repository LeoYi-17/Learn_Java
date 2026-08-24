/*故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
在他的一部著作中提出了一个有趣的问题：
假设一对刚出生的小兔一个月后就能长成大兔，
再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，一年内没有发生死亡
问：一对刚出生的兔子，一年内繁殖成多少对兔子?*/
// 计算斐波那契数列（Fibonacci）
package com.test.digui;

public class Demo_03_Digui {
    public static void main(String[] args) {
        int result = method(12);
        System.out.println(result);
    }
    public static int method(int n){
        if (n == 1 || n == 2){
            return 1;
        }
       return method(n-1) + method(n-2);
    }
}
