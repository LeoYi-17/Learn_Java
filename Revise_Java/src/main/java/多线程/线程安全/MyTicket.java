package 多线程.线程安全;

public class MyTicket implements Runnable{
    private int ticket = 100;
    //Object object = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
          /*  synchronized (object){
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                }
            }*/
            method01();
        }
    }
    public synchronized void method01(){
        if (ticket > 0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
