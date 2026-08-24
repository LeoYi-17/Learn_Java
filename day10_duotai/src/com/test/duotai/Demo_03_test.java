package com.test.duotai;

public class Demo_03_test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);
        Cat cat = new Cat();
        method(cat);
    }
    public static void method(Animals animals){
        animals.eat();
        //对象名 instanceof 类型 -> 判断关键字前面的对象是否属于关键字后面的类型
//        if (animals instanceof Dog){
//            // 向下转型-强转
//            Dog dog = (Dog) animals;
//            dog.lookHome();
//        } else if (animals instanceof Cat) {
//            // 向下转型-强转
//            Cat cat = (Cat) animals;
//            cat.catchMouse();
//        }else {
//            System.out.println("没有此类方法");
//        }
        //判断类型新特性(新语法) : 对象名 instanceof 类型 对象名  -> 隐含了一个强转
            if(animals instanceof Dog dog){
                dog.lookHome();
            } else if (animals instanceof Cat cat) {
                cat.catchMouse();
            }
    }
}
