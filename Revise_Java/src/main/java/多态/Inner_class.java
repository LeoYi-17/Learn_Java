package 多态;

public class Inner_class {
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public void open() {
                System.out.println("USB打开");
            }

            @Override
            public void close() {
                System.out.println("USB关闭");
            }
        });
    }
    public static void method(USB usb){
        usb.open();
        usb.close();
    }
}
