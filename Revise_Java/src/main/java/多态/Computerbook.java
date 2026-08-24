package 多态;

public class Computerbook {
   public void start(){
       System.out.println("电脑开机");
   }

   public void USB(USB usb){
       if (usb instanceof Mouse mouse){
           mouse.open();
           mouse.close();
       }else if (usb instanceof Keyboard keyboard){
           keyboard.open();
           keyboard.close();
       }
   }

    public void shut(){
        System.out.println("电脑关机");
    }
}
