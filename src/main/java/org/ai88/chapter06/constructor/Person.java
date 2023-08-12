package org.ai88.chapter06.constructor;

public class Person {
    int age;
    String sex;

    // 显示声明一个有参构造器，此时无参构造器将失效
    public Person(int age) {

    }

    public Person() {

    }

    public int addAge(int age) {
        return age + this.age;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.addAge(3);
    }
}