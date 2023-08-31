package org.ai88.chapter07.polymorphism;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/28 11:08
 */
public class Man extends Person{
    boolean isSmoking;
    int id = 1002;

    public void eat(){
        System.out.println("男人吃饭要很快");
    }

    public void walk(){
        System.out.println("男人走路腰挺直");
    }

    public void earnMoney(){
        System.out.println("男人要挣钱养家");
    }
}
