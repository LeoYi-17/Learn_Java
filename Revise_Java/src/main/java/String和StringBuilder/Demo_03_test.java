package String和StringBuilder;

import java.util.Scanner;

public class Demo_03_test {
    public static void main(String[] args) {
        // 已知用户名和密码，请用程序实现模拟用户登录。
        // 总共给三次机会，登录成功输出"登录成功",否则输出"登录失败",
        // 如果第三次都没有登录上去,就直接输出"账号冻结"
        String username = "admin";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String name = scanner.next();
            System.out.println("请输入密码");
            String pwd = scanner.next();
            if (name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else {
                if (i == 2){
                    System.out.println("账户冻结");
                }else {
                    System.out.println("账号或密码错误");
                }
            }
        }
    }
}
