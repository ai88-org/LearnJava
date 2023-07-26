package org.ai88.chapter03;

import java.util.Scanner;

/**
 * 相亲小程序
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 资产
        System.out.print("输入你的资产（单位:kw）");
        double money = scan.nextDouble();

        // 身高
        System.out.print("输入你的身高（单位:cm）");
        int height = scan.nextInt();

        // 帅不
        System.out.print("帅不帅（是/否）");
        String isHandsome = scan.next();

        if(money>1 && height > 180 && "是".equals(isHandsome)){
            System.out.println("一定嫁");
        }else if(money>1 || height > 180 || "是".equals(isHandsome)){
            System.out.println("可以考虑");
        }else{
            System.out.println("不考虑");
        }
    }
}
