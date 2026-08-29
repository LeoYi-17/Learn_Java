package 多线程.创建线程方式.实现Runnable接口;

public class Demo_02_Runnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+":正在执行......" + i);
                }
            }
        },"张三").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+":正在执行....."+i);
                }
            }
        },"李四").start();
    }
}
