package com.test.homework;

public class Computer {
    public void shart(){
        System.out.println("电脑开机");
    }
    public void USB(USB usb){
        if(usb instanceof Mouse mouse){
            mouse.open();
            mouse.close();
        }else if(usb instanceof Keyboard keyboard){
            keyboard.open();
            keyboard.close();
        }
    }
    public void open(){
        System.out.println("电脑关机");
    }
}
