package org.ai88.chapter05.functionexer.exer3;

public class Student {
    int number;
    int state;
    int score;

    public void add(int i,int j){
        System.out.println("11111");
    }

    public void add(double i,double j){
        System.out.println("22222");
    }

}

class StudentTest{
    public static void main(String[] args) {
        /*Student student = new Student();
        student.add(1,2.0);*/
        Student[] stus = new Student[20];

        for(int i=0;i<20;i++){
            stus[i] = new Student();
            stus[i].number = i;
            stus[i].score = (int)(Math.random()*101);
            stus[i].state = (int)(Math.random()*6)+1;
        }

        // 打印出3年级的学生信息
        /*for (Student student : stus) {
            if(student.state==3){
                System.out.println("学号是："+student.number+"，成绩是："+student.score);
            }
        }*/

        // 冒泡排序
        Student tmp = null;
        // 方法一
        for(int i=0;i<stus.length-1;i++){
            for(int j=i+1;j<stus.length;j++){
                if(stus[i].score< stus[j].score){
                    tmp = stus[j];
                    stus[j] = stus[i];
                    stus[i]=tmp;
                }
            }

            // 方法二
            for(int j = 0;j<stus.length-1-i;j++){
                if(stus[j].score > stus[j+1].score){
                    tmp = stus[j+1];
                    stus[j+1] = stus[j];
                    stus[j]=tmp;
                }
            }
        }

        for (Student student : stus) {
            System.out.println(student.score);
        }
    }
}
