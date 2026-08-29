package 多线程.创建线程方式.实现Runnable接口;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":正在执行..." + i);
        }
    }
}
