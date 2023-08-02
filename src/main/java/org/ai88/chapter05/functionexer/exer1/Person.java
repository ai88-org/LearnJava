package org.ai88.chapter05.functionexer.exer1;

public class Person {
    int age;
    String name;
    char gender;

    public void study(){
        System.out.println("studying");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        age = age + addAge;
    }
}

class PersonTest{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.study();
        System.out.println(p1.showAge());
        p1.addAge(2);
        System.out.println(p1.showAge());

        System.out.println("第二个对象开始了");
        Person p2 = new Person();
        p2.study();
        System.out.println(p2.showAge());
        p2.addAge(2);
        System.out.println(p2.showAge());
    }
}

