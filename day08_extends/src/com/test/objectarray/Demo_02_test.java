package com.test.objectarray;

public class Demo_02_test {
    public static void main(String[] args) {
        Students arr[] = new Students[5];

        Students P1 = new Students("张三",19,76);
        Students P2 = new Students("李四",22,87);
        Students P3 = new Students("王五",20,98);
        Students P4 = new Students("赵六",23,75);
        Students P5 = new Students("小七",21,86);

        arr[0] = P1;
        arr[1] = P2;
        arr[2] = P3;
        arr[3] = P4;
        arr[4] = P5;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                // 对比两个学生的分数
                if(arr[j].getScore() > arr[j+1].getScore()){
                    // 对象交换！不是交换分数，是交换数组里的学生对象
                    Students temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 遍历输出
        for (Students s : arr) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getScore());
        }
    }



}
