package com.test.duotai;

public class Demo_01_test {
    public static void main(String[] args) {
        //多态形式的创建对象
        Animals animal1 = new Dog();
        animal1.eat();
        //animal1.lookHome();多态前提下,无法调用子类特有内容

        Animals animal2 = new Cat();
        animal2.eat();
    }
}
