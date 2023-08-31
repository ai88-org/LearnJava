package org.ai88.chapter07.polymorphism.exer3;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/29 10:44
 */
public class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}