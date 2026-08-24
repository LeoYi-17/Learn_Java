/*需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度? 27

步骤:
 1.定义三个变量,分别表示山峰高度,纸的厚度,对折次数
 2.循环判断,如果纸的厚度<山峰高度,让纸对折,次数++
 3.输出次数*/
package com.test.While;

public class Demo_04_While {
    public static void main(String[] args) {
        int mountain = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper < mountain){
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
