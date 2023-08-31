package org.ai88.chapter07.polymorphism.exer4;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/29 11:15
 */
public class Man extends Person{
    @Override
    public void eat(){
        System.out.println("男人吃饭");
    }

    @Override
    public void toilet(){
        System.out.println("男人上厕所");
    }

    public void smoke(){
        System.out.println("男人喜欢抽烟");
    }
}
