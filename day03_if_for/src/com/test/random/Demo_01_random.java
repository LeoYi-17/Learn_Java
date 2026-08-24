//1-10之间的随机数
package com.test.random;

import java.util.Random;


public class Demo_01_random {
    public static void main(String[] args) {
        Random ra = new Random();
        int num = ra.nextInt(10)+1; //在1-10之间随机
        System.out.println(num);
    }

}
