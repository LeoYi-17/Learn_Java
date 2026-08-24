package com.test.a_singleton;

public class Singleton {
    /**
     * 我们需要将构造私有化
     * 这样外界就不能随便根据构造new对象了
     */
    private Singleton(){

    }

    /**
     * 由于是饿汉式,迫不及待的想要对象创建出来
     * 所以我们需要将对象变成静态的
     *
     * 为了不让外界直接用类名调用对象,我们需要将其变成私有的
     */
    private static Singleton singleton = new Singleton();

    /**
     * 对外提供公共的接口,将内部的对象给外界使用
     */
    public static Singleton getSingleton(){
        return singleton;
    }
}
