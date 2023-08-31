package org.ai88.chapter07.polymorphism;

/**
 * Description:
 *  多态的学习
 * @Author xuyang
 * @Create 2023/8/28 11:06
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }
}
