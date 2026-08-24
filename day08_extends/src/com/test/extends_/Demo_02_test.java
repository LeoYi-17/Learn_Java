package com.test.extends_;

public class Demo_02_test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.numfu();
        fu.num();//父类num方法

        System.out.println("===========================");
        Zi zi = new Zi();
        zi.numzi();
        zi.numfu();
        zi.num();//子类num方法

        System.out.println("===========================");

        //多态
        Fu f = new Zi();
        f.num();
    }
}
