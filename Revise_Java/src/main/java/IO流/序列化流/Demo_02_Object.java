package IO流.序列化流;

import java.io.*;
import java.util.ArrayList;

public class Demo_02_Object {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writer();
        reader();
    }
    private static void writer() throws IOException {
        // 反序列化存多个对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Users\\LuYi\\Desktop\\IO\\person.txt"));
        Person person1 = new Person("张三", 19);
        Person person2 = new Person("李四", 19);
        Person person3 = new Person("王五", 19);

        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);

        oos.writeObject(list);
        oos.close();
    }


    private static void reader() throws IOException, ClassNotFoundException {
        // 反序列化读多个对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Users\\LuYi\\Desktop\\IO\\person.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list = (ArrayList<Person>) o;
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();
    }

}
