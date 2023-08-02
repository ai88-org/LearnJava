package org.ai88.chapter05.functionexer.exer2;

public class Exer {
    public static void main(String[] args) {
        Exer e = new Exer();
        //e.method1();
        /*int s1 = e.method2();
        System.out.println("面积一是："+s1);*/

        int s2 = e.method3(5,6);
        System.out.println("面积二是："+s2);
    }

    public void method1() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public int method2(){
        method1();
        return 8*10;
    }

    public int method3(int m,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return n*m;
    }
}
