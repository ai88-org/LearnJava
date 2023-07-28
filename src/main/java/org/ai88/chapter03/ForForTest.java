package org.ai88.chapter03;

/**
 * 使用嵌套循环打印出
 * ----------*
 * --------* * *
 * ------* * * * *
 * ----* * * * * * *
 * --* * * * * * * * *
 * ----* * * * * * *
 * ------* * * * *
 * --------* * *
 * ----------*
 * <p>
 * 思路：
 * 按照递增 递减的顺序分成两部分去打印
 */
public class ForForTest {
    public static void main(String[] args) {
        // 递增部分
        for (int i = 1; i <= 5; i++) {
            // 空格的循环
            for (int i1 = 1; i1 <= 12 - 2 * i; i1++) {
                System.out.print("-");
            }
            // *的循环
            for (int i1 = 1; i1 <= 2 * i-1; i1++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }

        // 递减部分
        for (int i = 4; i >= 1; i--) {
            // 空格的循环
            for (int i1 = 1; i1 <= 12 - 2 * i; i1++) {
                System.out.print("-");
            }
            // *的循环
            for (int i1 = 1; i1 <= 2 * i-1; i1++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
