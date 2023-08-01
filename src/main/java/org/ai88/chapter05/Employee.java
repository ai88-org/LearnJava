package org.ai88.chapter05;

public class Employee {
    String no;
    String name;
    int age;
    double salary;
    MyDate myDate;

    public void show(){
        System.out.println("编号是："+this.no+"，姓名是："+this.name+"，工资是："+this.salary);
    }
}
