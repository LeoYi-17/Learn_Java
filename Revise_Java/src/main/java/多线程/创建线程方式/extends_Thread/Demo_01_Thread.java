package 多线程.创建线程方式.extends_Thread;

public class Demo_01_Thread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("张三");
        myThread.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000L);
            System.out.println(Thread.currentThread().getName()+":Main正在执行......" + i);
        }
    }
}
