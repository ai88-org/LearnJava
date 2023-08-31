package org.ai88.chapter07.polymorphism;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/28 11:50
 */
public class Woman extends Person{
    boolean isBeauty;

    public void eat(){
        System.out.println("女人不大吃肉");
    }

    public void walk(){
        System.out.println("女人走路很窈窕");
    }

    public void goShopping(){
        System.out.println("女人喜欢购物");
    }
}
