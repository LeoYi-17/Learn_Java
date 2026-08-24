package com.test.inner_class_abstract;

public class Demo_01_test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method01(dog);
        Animals animals = method02();
        animals.eat();
    }
    /**
     * 抽象类作为方法的形参
     */
    public static void method01(Animals animals){
        animals.eat();
    }
    /**
     * 抽象类作为方法的返回值
     */
    public static Animals method02(){
        Dog dog = new Dog();
        return dog;
    }
}
