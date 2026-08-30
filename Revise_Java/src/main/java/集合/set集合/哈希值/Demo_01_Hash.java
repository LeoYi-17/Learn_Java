package 集合.set集合.哈希值;

import org.junit.Test;

import java.util.HashSet;

public class Demo_01_Hash {
    @Test
    public void test01(){
        //  哈希值不一样,内容肯定不一样
        //  哈希值一样,内容也有可能不一样(哈希冲突,哈希碰撞)
        Person peroson1 = new Person("张三", 18);
        Person peroson2 = new Person("张三", 18);
        System.out.println(peroson1.hashCode());//24022538
        System.out.println(peroson2.hashCode());//24022538
        String s1 = "通话";
        String s2 = "重地";
        System.out.println(s1.hashCode());//1179395
        System.out.println(s2.hashCode());//1179395
    }
    @Test
    public void test02(){
        // 去重
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("张三",18));
        hashSet.add(new Person("张三",18));
        hashSet.add(new Person("张三",19));
        System.out.println(hashSet);
    }
}
