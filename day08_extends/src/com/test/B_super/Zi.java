package com.test.B_super;

public class Zi extends Fu{
    public int num = 10;
    public Zi(){
        super();//调用父类无参构造
        System.out.println("子类无参构造");
    }
    public Zi(int num){
        super(10);//调用父类有参构造
        System.out.println("子类有参构造");
    }
    @Override
    public void show(){
        super.show();//调用父类方法

        System.out.println(num);//子类num
        System.out.println(super.num);//父类num

        System.out.println("子类show方法");
    }
}
