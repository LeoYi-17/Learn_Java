package Stream流;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo_01_Stream {
    @Test
    public void test01(){
        // 筛选出姓张的人名,筛选出长度为3的人名,遍历
        ArrayList<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("马尔扎哈");
        list.add("张三");
        list.add("张无忌");
        list.add("马帅");
        list.add("张杰");
        list.add("鹿晗");
        list.add("蔡徐坤");
        list.add("张三丰");

        Stream<String> stream = list.stream();
        stream.filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
    @Test
    public void test02(){
        // 对数组和集合的获取
        Stream<String> stream1 = Stream.of("张三", "李四", "王五");
        System.out.println(stream1);

        ArrayList<String> list = new ArrayList<>();
        list.add("赵六");
        list.add("田七");
        list.add("老八");

        Stream<String> stream2 = list.stream();
        System.out.println(stream2);
    }
    @Test
    public void test03(){
        // 遍历元素
        Stream<String> stream = Stream.of("王钰栋", "蒯纪闻", "刘城宇");
        stream.forEach(s -> System.out.println(s));
    }
    @Test
    public void test04(){
        // 统计元素个数
        Stream<String> stream = Stream.of("王钰栋", "蒯纪闻", "刘城宇", "伊木兰", "李昊", "胡荷韬", "徐彬", "杨希");
        System.out.println(stream.count());
    }
    @Test
    public void test05(){
        // 获取前5个元素
        Stream<String> stream1 = Stream.of("王钰栋", "蒯纪闻", "刘城宇", "伊木兰", "李昊", "胡荷韬", "徐彬", "杨希");
        stream1.limit(5).forEach(s -> System.out.println(s));
        System.out.println("————————————————");
        // 跳过前5个元素,获取后面的元素
        Stream<String> stream2 = Stream.of("王钰栋", "蒯纪闻", "刘城宇", "伊木兰", "李昊", "胡荷韬", "徐彬", "杨希");
        stream2.skip(5).forEach(s -> System.out.println(s));
    }
    @Test
    public void test06(){
        // 两个流合成一个流
        Stream<String> stream1 = Stream.of("王钰栋", "蒯纪闻", "刘城宇", "伊木兰", "李昊", "胡荷韬", "徐彬", "杨希");
        Stream<String> stream2 = Stream.of("赵松源", "万项", "周雨诺", "徐正鹏", "邝兆镭");
        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));
    }
    @Test
    public void test07(){
        // 将Stream流变成集合
        Stream<String> stream = Stream.of("王钰栋", "蒯纪闻", "刘城宇", "伊木兰", "李昊", "胡荷韬", "徐彬", "杨希");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
    @Test
    public void test08(){
        // 元素去重复
        Stream<Person> personStream = Stream.of(new Person("张三", 18), new Person("张三", 18), new Person("张三", 19));
        personStream.distinct().forEach(s -> System.out.println(s));
    }
    @Test
    public void test09(){
        // 转换流中的数据类型
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.map(integer -> integer + "").forEach(s -> System.out.println(s+1));
    }
}
