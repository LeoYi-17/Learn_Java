package com.test.object;

public class Demo_02_TextObject {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.cardId = "111";
        citizen.name = "小王";
        MyDate myDate = citizen.birthday;
        myDate = new MyDate();
        myDate.year = 1999;
        myDate.month = 10;
        myDate.day = 10;
        System.out.println(citizen.cardId);
        System.out.println(citizen.name);
        System.out.println(myDate.year);
        System.out.println(myDate.month);
        System.out.println(myDate.day);
    }
}
