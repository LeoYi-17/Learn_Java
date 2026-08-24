// 键盘录入一个整数,找出整数在数组中存储的索引位置，如果找不到输出-1
package com.test.array;

import java.util.Scanner;

public class Demo_09_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int info[] = {1,3,34,454,464,65,7567};
        int data = sc.nextInt();
        //定义一个标记,表示数组中是否有这个数据
        int flag = 0;
        // 遍历数组，用data1和每一个遍历出来的元素进行比较
        for (int i = 0; i < info.length; i++) {
            if(info[i] == data){
                System.out.println(i);
                flag++;
            }
        }
        /*循环之后,如果flag还是0,证明在循环的过程中if语句就没有执行过
        if没有执行过,证明数组中没有我们想要找的元素*/
        if (flag == 0){
            System.out.println(-1);
        }

    }
}
