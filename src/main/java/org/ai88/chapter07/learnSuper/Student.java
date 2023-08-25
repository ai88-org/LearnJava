package org.ai88.chapter07.learnSuper;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/24 14:43
 */
public class Student extends Person{
    String school;

    int id = 1;

    public void study(){
        System.out.println("学生学习");
    }

    @Override
    public void eat(){
        System.out.println("学生吃饭");
    }

    @Override
    public void sleep(){
        System.out.println("学生睡觉");
    }
}
