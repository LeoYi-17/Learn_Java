package com.test.homework;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        computer.shart();
        computer.USB(mouse);
        computer.USB(keyboard);
        computer.shart();
    }
}
