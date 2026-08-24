package com.test.two_array;

public class Demo_03_TwoArray {
    public static void main(String[] args) {
        String[][] arr = {{"唐僧","孙悟空","猪八戒"},{"刘备","关羽"}};
        System.out.println(arr[0][0]);//唐僧
        System.out.println(arr[1][1]);//关羽
        System.out.println("--------------------------");
        int arr2[][]  = new int[3][3];
        arr2[0][0] =100;
        arr2[0][1] =200;
        arr2[0][2] =300;

        arr2[1][0] =1000;
        arr2[1][1] =2000;
        arr2[1][2] =3000;

        arr2[2][0] =10000;
        arr2[2][1] =20000;
        arr2[2][2] =30000;
        System.out.println(arr2[0][0]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[2][0]);
        System.out.println("--------------------------");
        //先遍历二维数组,将每一个一维数组获取出来
        for (int i = 0; i < arr2.length; i++) {
            //再遍历每一个一维数组
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }
    }
}
