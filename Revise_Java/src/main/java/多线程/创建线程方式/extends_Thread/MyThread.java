package 多线程.创建线程方式.extends_Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread()+getName()+"MyThread正在执行"+i);
        }
    }
}
