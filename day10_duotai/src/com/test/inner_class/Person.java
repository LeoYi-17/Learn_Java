package com.test.inner_class;

public class Person {
    public void eat(){
        System.out.println("吃饭");
        new Heart().jump();
    }
//    //静态成员内部类
//    static class Heart{
//        public void jump(){
//            System.out.println("心脏在咣咣咣跳");
//        }
//    }
//非静态成员内部类
class Heart{
    public void jump(){
        System.out.println("心脏在咣咣咣跳");
    }
}
}
