package org.ai88.chapter03;

import java.util.Scanner;

/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数
 * 比如12和20的最大公约数是4，最小公倍数是60
 */
public class ForTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入m:");
        int m = scan.nextInt();
        System.out.print("请输入n:");
        int n = scan.nextInt();

        // 假设最大公约数为1
        int max = 1;
        for (int i = 2; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0 && i > max) {
                max = i;
            }
        }
        System.out.println(m + "和" + n + "最大公约数为：" + max + "，最小公倍数为：" + ((m / max) * n));

        // 方式2，求最小公约数的时候倒过来运行
        // 效率更高
        int min = (m < n) ? m : n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为:" + i);
                break;
            }
        }
    }
}
