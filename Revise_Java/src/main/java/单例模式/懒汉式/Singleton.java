package 单例模式.懒汉式;

public class Singleton {
    public Singleton() {

    }
    private static Singleton singleton = null;
    public static Singleton getSingleton(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
