package org.ai88.chapter03;

/**
 * 1.使用switch-case实现，学生成绩大于60分的输出合格，低于60分的输出不合格
 * 2.从键盘输入2023年的月份和天，计算出为2023年的第几天
 */
public class SwitchCaseExer {
    public static void main(String[] args) {
        int score = 10;
        switch (score/60){
            case 0:
                System.out.println("不合格");
                break;
            default:
                System.out.println("合格");
        }
    }
}
