package org.ai88.chapter07.polymorphism.exer3;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/29 10:44
 */
public class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
