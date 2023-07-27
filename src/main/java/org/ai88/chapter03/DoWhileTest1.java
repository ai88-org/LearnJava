package org.ai88.chapter03;

import java.util.Scanner;

/**
 * 题目：模拟ATM取款
 * 声明变量balance并初始化为0，用以表示银行账户余额，通过程序实现存款、取款等功能
 *
 * ==========ATM===========
 * 1、存款
 * 2、取款
 * 3、显示余额
 * 4、退出
 * 请选择（1-4）
 */
public class DoWhileTest1 {
    public static void main(String[] args) {
        double balance = 0.0;
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        do{
            System.out.println("==========ATM===========");
            System.out.println("1、存款");
            System.out.println("2、取款");
            System.out.println("3、显示余额");
            System.out.println("4、退出");
            System.out.print("请选择（1-4）");

            int selection = scan.nextInt();
            switch (selection){
                case 1:
                    System.out.print("请输入存款金额: ");
                    double money = scan.nextDouble();
                    balance += money;
                    break;
                case 2:
                    System.out.print("请输入取款金额: ");
                    money = scan.nextDouble();
                    balance -= money;
                    break;
                case 3:
                    System.out.println("余额为："+balance);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("输入错误，请重新选择！");
            }
        }while(flag);
    }
}
