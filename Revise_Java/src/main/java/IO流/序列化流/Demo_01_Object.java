package IO流.序列化流;

import java.io.*;

public class Demo_01_Object {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writer();
        reader();
    }
    private static void writer() throws IOException {
        // 序列化流写对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Users\\LuYi\\Desktop\\IO\\person.txt"));
        Person person = new Person("张三", 18);
        oos.writeObject(person);
        oos.close();
    }
    private static void reader() throws IOException, ClassNotFoundException {
        // 反序列化流读对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Users\\LuYi\\Desktop\\IO\\person.txt"));
        Object o = ois.readObject();
        Person p = (Person) o;
        System.out.println(p);
        ois.close();
    }
}
