package com.test.operater;
//需求:有两个和尚,分别身高为150  , 170 获取两个和尚的最高身高
public class Demo09_Sanyuan {
    public static void main(String[] args) {
        int heshang1 = 150;
        int heshang2 = 170;
        int MAX = heshang1 > heshang2 ? heshang1:heshang2;
        System.out.println(MAX);
    }
}
