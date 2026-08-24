package com.test.properties;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Demo_01_properties {
    @Test
    public void test01(){
        Properties properties = new Properties();
        properties.setProperty("username", "tom");
        properties.setProperty("password", "123456");
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
    @Test
    public void test02() throws IOException {
        Properties properties = new Properties();
          /*
        类名.class -> 获取的是这个类的Class对象
        Class对象中有一个方法:getClassLoader() -> 获取的是类的加载器 -> 返回的是ClassLoader对象
        ClassLoader对象中有一个方法:getResourceAsStream("resources资源目录下的配置文件名"),返回的是InputStream对象

        这种操作可以直接扫描resources资源目录下的配置文件
      */
        InputStream in = Demo_01_properties.class.getClassLoader().getResourceAsStream("pro.properties");
        //利用load方法将流中的数据加载到Properties集合中
        properties.load(in);

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(username + ":" + password);
    }
}
