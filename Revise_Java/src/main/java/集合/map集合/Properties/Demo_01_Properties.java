package 集合.map集合.Properties;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Demo_01_Properties {
    @Test
    public void test01(){
        Properties properties = new Properties();
        properties.setProperty("username：", "tom");
        properties.setProperty("password：", "123456");
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key+value);
        }
    }
    @Test
    public void test02() throws IOException {
        Properties properties = new Properties();
        InputStream in = Demo_01_Properties.class.getClassLoader().getResourceAsStream("pro.properties");
        properties.load(in);
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(username + ":" + password);
    }
}
