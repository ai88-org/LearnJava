package org.ai88.chapter03;

import java.util.Scanner;

/**
 * 1.使用switch-case实现，学生成绩大于60分的输出合格，低于60分的输出不合格
 * 2.从键盘输入2023年的月份和天，计算出为2023年的第几天
 */
public class SwitchCaseExer {
    public static void main(String[] args) {
        int score = 10;
        switch (score / 60) {
            case 0:
                System.out.println("不合格");
                break;
            default:
                System.out.println("合格");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = scan.nextInt();

        System.out.print("请输入日子：");
        int day = scan.nextInt();
        int sum = 0;

        switch (month) {
            case 12:
                sum = sum + 30;
            case 11:
                sum = sum + 31;
            case 10:
                sum = sum + 30;
            case 9:
                sum = sum + 31;
            case 8:
                sum = sum + 31;
            case 7:
                sum = sum + 30;
            case 6:
                sum = sum + 31;
            case 5:
                sum = sum + 30;
            case 4:
                sum = sum + 31;
            case 3:
                sum = sum + 28;
            case 2:
                sum = sum + 31;
            case 1:
                sum += day;
            default:
                System.out.println("这是2023年的第" + sum + "天");
        }

    }
}
