//求1-100的和
package com.test.While;

public class Demo_01_While {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i<=100){
            count += i;
            i++;
        }
        System.out.println(count);
    }
}
