package org.ai88.project01;

import java.util.Scanner;

/**
 * 谷粒记账软件，功能如下：
 * 1. 显示文本内容
 * 2. 输入1，打印输出收支明细
 * 3. 输入2，登记收入，以及收入说明
 * 4. 输入3，登记支出，以及支出说明
 * 5. 输入4，退出，退出还要询问一下，是否真的退出
 */
public class Guli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 退出软件标志
        boolean flag = true;
        // 初始化输入
        String input = "123";
        // 余额
        double balance = 10000;
        // 收支明细
        String shouzhi = "";
        double money = 0;
        String details = "";


        do {
            // 显示菜单
            System.out.println("---------------谷粒记账软件-------------");
            System.out.println("    1. 收支明细");
            System.out.println("    2. 登记收入");
            System.out.println("    3. 登记支出");
            System.out.println("    4. 退出");
            System.out.print("    请选择(1-4): ");

            // 接受输入
            input = scanner.next();

            // 如果是非法输入，则要求重新输入
            while (!("1".equals(input) || "2".equals(input) || "3".equals(input) || "4".equals(input))) {
                System.out.print("输入非法，重新输入: ");
                input = scanner.next();
            }

            // 处理输入
            // 1.收支明细 收支 账户金额 收支金额 说明
            switch (input.charAt(0)) {
                case '1':
                    System.out.println("---------------------当前收支明细记录--------------------");
                    System.out.println("收支\t\t\t账户金额\t\t\t收支金额\t\t\t说明");
                    System.out.println(details);
                    System.out.println("------------------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额: ");
                    double income = scanner.nextDouble();
                    System.out.print("本次收入说明: ");
                    String comment = scanner.next();
                    balance += income;
                    details = details +"\n"+"收入"+"\t\t\t"+balance+"\t\t\t"+income+"\t\t\t"+comment;
                    break;
                case '3':
                    System.out.print("本次支出金额: ");
                    double paid = scanner.nextDouble();
                    System.out.print("本次支出说明: ");
                    comment = scanner.next();
                    balance -= paid;
                    details = details +"\n"+"支出"+"\t\t\t"+balance+"\t\t\t"+paid+"\t\t\t"+comment;
                    break;
                case '4':
                    System.out.print("确认退出吗？（Y/N）");
                    input = scanner.next();
                    if ("y".equalsIgnoreCase(input)) {
                        flag = false;
                    }
                    break;
            }

        } while (flag);

        scanner.close();
    }
}


