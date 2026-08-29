package 多线程.创建线程方式.实现Runnable接口;

public class Demo_01_Runnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+":Main正在执行......" + i);
        }
    }
}
