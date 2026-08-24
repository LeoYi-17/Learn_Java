//返回n个字符串拼接结果，如果没有传入字符串，那么返回空字符串""
package com.test.var;

public class Demo_02_Var {
    public static void main(String[] args) {
       String info = string("王钰栋","张玉宁","韦世豪");
        System.out.println(info);
    }
    public static String string(String ...arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str+=arr[i];
        }
        return str;
    }
}
