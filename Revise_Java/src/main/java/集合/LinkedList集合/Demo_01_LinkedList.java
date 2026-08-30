package 集合.LinkedList集合;

import org.junit.Test;

import java.util.LinkedList;

public class Demo_01_LinkedList {
    @Test
    public void test01(){
        LinkedList<String> list = new LinkedList<>();
        list.add("开心超人");
        list.add("哆啦A梦");
        list.add("柯南");
        list.add("加菲猫");
        // 将指定元素插入此列表的开头。
        list.addFirst("天猫精灵");
        System.out.println(list);
        // 将指定元素添加到此列表的结尾。
        list.addLast("小爱同学");
        System.out.println(list);
        // 返回此列表的第一个元素
        System.out.println(list.getFirst());
        // 返回此列表最后一个元素
        System.out.println(list.getLast());
        // 移除并返回此列表的第一个元素
        System.out.println(list.removeFirst());
        // 移除并返回此列表的最后一个元素
        System.out.println(list.removeLast());
        // 遍历列表
        System.out.println("——————————————————");
        for (String s : list) {
            System.out.println(s);
        }
    }
    @Test
    public void test02() {
        LinkedList<String> list = new LinkedList<>();
        list.push("开心超人");
        list.push("哆啦A梦");
        list.push("柯南");
        list.push("加菲猫");
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
    }
}
