package org.ai88.chapter05;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "张三";
        e2.name = "李四";

        // 这种写法有问题
        // 必须先有对象！！！
//        e1.myDate.year = 1991;
//        e2.myDate.year = 1991;
//        e1.myDate.month = 1;
//        e2.myDate.month = 15;
//        e1.myDate.day = 1;
//        e2.myDate.day = 16;
        e1.myDate = new MyDate();
        e1.myDate.year = 1991;
        e1.myDate.month = 1;
        e1.myDate.day = 1;

        System.out.println(e1.name+"生日是"+e1.myDate.year+"年"+e1.myDate.month+"月"+e1.myDate.day+"日");
    }
}
