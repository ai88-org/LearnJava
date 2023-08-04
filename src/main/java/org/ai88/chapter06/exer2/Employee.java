package org.ai88.chapter06.exer2;

import java.util.Scanner;

public class Employee {
    private String name;
    private String sex;
    private int age;
    private String telphone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getInfo() {
        return getName() + "\t\t" + getSex() + "\t\t" + getAge() + "\t\t" + getTelphone();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] es = new Employee[2];
        for (int i = 0; i < 2; i++) {
            es[i] = new Employee();
            System.out.println("请输入员工"+(i+1)+"信息");
            System.out.print("姓名：");
            es[i].setName(scan.next());
            System.out.print("性别：");
            es[i].setSex(scan.next());
            System.out.print("年龄：");
            es[i].setAge(scan.nextInt());
            System.out.print("电话：");
            es[i].setTelphone(scan.next());

        }
        scan.close();

        // 遍历输出
        System.out.println("-------------------员工列表-------------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话");
        for (int i=1;i<=es.length;i++) {
            System.out.println(i+"\t\t"+es[i-1].getName()+"\t\t"+es[i-1].getSex()+"\t\t"+es[i-1].getAge()+"\t\t"+es[i-1].getTelphone());
        }
        System.out.println("-------------------员工列表完成-------------------");
    }
}


