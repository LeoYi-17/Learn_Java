package 集合.map集合.Vector;

import org.junit.Test;

import java.util.Vector;

public class Demo_01_Vector {
    @Test
    public void test01() {
        Vector<String> vector = new Vector<>();
        vector.add("张三");
        vector.add("李四");
        vector.add("王五");
        System.out.println(vector);
        for (String s : vector) {
            System.out.println(s);
        }
    }
}
