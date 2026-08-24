package 封装;

public class fengzhuang {
    public static void main(String[] args) {
        // 定义一个数组,存3个Person对象,遍历数组,将Person对象中的属性值获取出来
        Person arr[] = new Person[3];
        Person p1 = new Person("张三","男",19);
        Person p2 = new Person("李四","男",22);
        Person p3 = new Person("王五","男",32);
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        for (Person person : arr) {
            System.out.println(person.getName()+person.getSex()+person.getAge());
        }
        System.out.println("——————————————————————————————————");
        // 定义一个学生类,声明姓名,年龄,分数,创建5个学生对象为属性赋值,放数组中,然后按照分数排序
        Students[] arr2 = new Students[5];
        arr2[0] = new Students("张三",19,"语文",87);
        arr2[1] = new Students("李四",18,"语文",65);
        arr2[2] = new Students("王五",19,"语文",97);
        arr2[3] = new Students("赵六",19,"语文",76);
        arr2[4] = new Students("田七",18,"语文",82);

        for (Students students : arr2) {
            System.out.println(students.getName()+students.getAge()+students.getSubject()+students.getScore());
        }
    }
}
