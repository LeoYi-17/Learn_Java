package com.test.b_singleton;

public class Singleton {
    private Singleton(){

    }
    private static Singleton singleton = null;

    public static Singleton getSingleton() {
        // 第一次判断，避免每次抢锁
        if (singleton == null){
            // 类锁
            synchronized (Singleton.class){
                // 第二次判断，多个线程等待锁之后防止重复new
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
