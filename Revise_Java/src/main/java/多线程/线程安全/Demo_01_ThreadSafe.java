package 多线程.线程安全;

public class Demo_01_ThreadSafe {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread t1 =  new Thread(myTicket,"张三");
        Thread t2 =  new Thread(myTicket,"李四");
        Thread t3 =  new Thread(myTicket,"王五");
        t1.start();
        t2.start();
        t3.start();
    }
}
