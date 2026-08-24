package com.test.array;

public class Demo_01_array {
    public static void main(String[] args) {
        //动态初始化
        int array1[] = new int[2];
        String array2[] = new String[3];
        //静态初始化
        int array3[] = {1,2,3,4,5};
        String array4[] = {"a","b","c"};

        System.out.println("array1长度是"+array1.length);
        System.out.println("array2长度是"+array2.length);
        System.out.println("array3长度是"+array3.length);
        System.out.println("array4长度是"+array4.length);

        System.out.println(array3[0]); //1
        System.out.println(array4[2]); //c
    }
}
