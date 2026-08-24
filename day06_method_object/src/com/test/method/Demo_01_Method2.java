package com.test.method;

public class Demo_01_Method2 {
    public static void main(String[] args) {
        int result = method01();
        System.out.println(result);

        //method02(10,20);
    }

    public static int[] method04(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        int sub = a-b;
        int[] arr = {sum,sub};
        return arr;
    }

    public static String method03(int a,int b){
        //return "hello world";
        //return "hello world";
        if (a>b){
            return "a>b";
        }else{
            return "a<=b";
        }

        /*if (a>b){
            return "a>b";
        }else if (a<=b){
            return "a<=b";
        }*/
    }


    public static void method02() {
        System.out.println("方法02");
    }

    public static int method01() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;//将结果返回,然后结束方法
        //return;//结束方法
    }
}
