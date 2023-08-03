package org.ai88.chapter06.exer1;

public class Person {
    private int age;

    public void setAge(int age){
        if(age<0 || age > 130){
            System.out.println("非法输入");
        }else{
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}

class PersonTest{
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(100);
        System.out.println(b.getAge());
        b.setAge(131);
        System.out.println(b.getAge());
    }

}