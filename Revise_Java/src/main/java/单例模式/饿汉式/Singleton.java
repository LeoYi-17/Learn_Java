package 单例模式.饿汉式;

public class Singleton {
    public Singleton() {

    }
    private static Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return  singleton;
    }
}
