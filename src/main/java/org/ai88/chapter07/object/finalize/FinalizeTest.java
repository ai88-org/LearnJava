package org.ai88.chapter07.object.finalize;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/31 19:35
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person("张三",18);
        System.out.println(p);
        p = null;
        System.gc();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我要消失了" + this);
    }
}

class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
}