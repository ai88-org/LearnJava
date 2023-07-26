package org.ai88.chapter02;

/**
 * 测试一下&、&&、|、||
 */
public class LogicTest {
    public static void main(String[] args) {
        boolean b1 = false;
        int num = 10;

        // 单与 哪怕b1为false 另外一个条件边也会执行的
        /*if (b1 & (num++ > 0)) {
            System.out.println("条件成立");
        } else {
            System.out.println("条件不成立"); // 这里
        }

        // 输出num看看是否执行了
        System.out.println("num=" + num); // num=11*/

        // 双与 有一个条件不满字 另外一个条件加不执行
        if (b1 && (num++ > 0)) {
            System.out.println("条件成立");
        } else {
            System.out.println("条件不成立"); // 这里
        }

        // 输出num看看是否执行了
        System.out.println("num=" + num); // num=10


    }
}
