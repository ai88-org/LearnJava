package org.ai88.chapter05;

public class ReadTest {
    public static void main(String[] args) {
        int a = 10;
        int b=10;
        method(a,b);

        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    // 需要在method方法被调用之后，仅打印出a=100,b=200
    public static void method(int a,int b){
        System.out.println("a=100");
        System.out.println("b=200");
        System.exit(0);
    }
}
