package String和StringBuilder;

import org.junit.Test;

public class Demo_02_StringBuilder {
    @Test
    public void test01(){
        // 拼接字符串，反转内容，最后转为String类型
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("张三").append("李四").append("王五");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String string = stringBuilder.toString();
        System.out.println(string);
    }
    @Test
    public void test02(){
        // 给一个字符串,判断这个字符串是否是"回文内容"
        // 上海自来水来自海上
        String s = "上海自来水来自海上";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        String string = stringBuilder.toString();

        if(s.equals(string)){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
