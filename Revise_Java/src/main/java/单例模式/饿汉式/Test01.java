package 单例模式.饿汉式;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Singleton singleton = new Singleton();
            System.out.println(singleton);
        }
    }
}
