package org.ai88.chapter06.exer3;

public class Test {
    public void test1(int ...args){
        for (int arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.test1(1,2,3,4,5);
    }
}


