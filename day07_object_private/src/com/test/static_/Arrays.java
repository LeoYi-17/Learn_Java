package com.test.static_;

public class Arrays {
    //构造私有
    private Arrays(){}
    //提供一个方法,专门求int数组的元素和
    public static int arraySum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
