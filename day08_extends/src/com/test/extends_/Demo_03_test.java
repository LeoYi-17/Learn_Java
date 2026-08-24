package com.test.extends_;

public class Demo_03_test {
    public static void main(String[] args) {
        OldPhone OP = new OldPhone();
        OP.call();
        OP.sendMessage();
        OP.show();
        System.out.println("————————————————————————————");
        NewPhone NP = new NewPhone();
        NP.call();
        NP.sendMessage();
        NP.show();
    }
}
