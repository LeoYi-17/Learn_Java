package com.test.object_class;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo_01_Object {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();

        /*
          Arrays:就是我们找来的对象
          toString方法:就是这个对象实现好的功能
         */
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        String data = sc.next();

        Random rd = new Random();
        int data2 = rd.nextInt();

    }
}
