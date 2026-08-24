package com.test.array;

public class Demo_04_System_arraycopy {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = new int[5];
        System.arraycopy(arr1,0,arr2,0,5);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
