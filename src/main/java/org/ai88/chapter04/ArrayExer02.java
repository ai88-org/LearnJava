package org.ai88.chapter04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 从键盘输入学生成绩，并找出最高分，并输出学生成绩等级
 * 成绩>=最高分-10   等级为'A'
 * 成绩>=最高分-20   等级为'B'
 * 成绩>=最高分-30   等级为'C'
 * 其余             等级为'D'
 * <p>
 * 先读入学生人数，根据学生人数创建Int数组，存放学生成绩
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int num = scan.nextInt();

        System.out.println("请输入" + num + "个成绩：");
        int[] arr = new int[num];

        // 赋值并找出最高分
        int max = arr[0];
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最高分是：" + max);

        // 得分明细
        char grade;
        String first;
        for (int i = 0; i < num; i++) {
            first = "Student " + i + " score is " + arr[i] + " grade is ";
            if (arr[i] >= max - 10) {
                grade = 'A';
            } else if (arr[i] >= max - 20) {
                grade = 'B';
            } else if (arr[i] >= max - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            first = first + grade;
            System.out.println(first);
        }

        scan.close();
    }
}
