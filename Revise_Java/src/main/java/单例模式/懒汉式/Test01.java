package 单例模式.懒汉式;

public class Test01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getSingleton();
                System.out.println(singleton);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getSingleton();
                System.out.println(singleton);
            }
        }).start();
    }
}
