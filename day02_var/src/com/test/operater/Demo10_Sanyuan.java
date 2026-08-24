package com.test.operater;
//需求:有三个和尚,分别身高为150 210 170 获取三个和尚的最高身高
public class Demo10_Sanyuan {
    public static void main(String[] args) {
        int heshang1 = 150;
        int heshang2 = 170;
        int heshang3 = 210;
        int temp = heshang1 > heshang2 ? heshang1:heshang2; //temp:170
        int MAX =  temp > heshang3 ? temp:heshang3;
        System.out.println(MAX);
    }
}
