package org.ai88.chapter03;

import java.util.Scanner;

/**
 * 键盘输入三个整数，分别存入变量num1、num2、num3。
 * 对它们进行排序，并且从小到大输出
 */
public class IfElseTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入num1的值");
        int num1 = scanner.nextInt();

        System.out.println("请输入num2的值");
        int num2 = scanner.nextInt();

        System.out.println("请输入num3的值");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    System.out.println("num1=" + num1 + ",num2=" + num2 + ",num3=" + num3);
                }else{
                    System.out.println("num1=" + num1 + ",num3=" + num3 + ",num2=" + num2);
                }
            }else{
                System.out.println("num3=" + num3 + ",num1=" + num1 + ",num2=" + num2);
            }
        }else{
            if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println("num2=" + num2 + ",num1=" + num1 + ",num3=" + num3);
                }else{
                    System.out.println("num2=" + num2 + ",num3=" + num3 + ",num1=" + num1);
                }
            }else{
                System.out.println("num3=" + num3 + ",num2=" + num2 + ",num1=" + num1);
            }
        }

        // 关闭资源
        scanner.close();
    }
}
