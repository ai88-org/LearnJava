package org.ai88.chapter05;

public class ArgsTest {
    public void test1(int ... num){
        System.out.println(11111);
    }

    // 与test1构成重载
    public void test1(){
        System.out.println(22222);
    }

    // 与test1构成重载
    public void test1(int num){
        System.out.println(33333);
    }

    // 与test1构成重载
    public void test1(int num1,int num2){
        System.out.println(44444);
    }

    // 被视为相同的方法，不是重载，就会冲突了
    // jdk17
    /*public void test1(int[] num){}*/
}
