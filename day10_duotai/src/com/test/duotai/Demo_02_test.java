package com.test.duotai;

public class Demo_02_test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
    }
    /**
     * Animals animals = dog
     * Animals animals = cat
     * @param animals
     *
     * 形参搞一个父类类型,就可以动态接收任意它的子类对象
     * 接收哪个子类对象,就会指向哪个子类对象
     * 就会动态的调用哪个子类对象重写的方法
     */
    public static void method(Animals animals){
        animals.eat();
    }
}
