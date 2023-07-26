package org.ai88.chapter02;

/**
 * 定义一个LogicExer类
 * 定义main方法
 * 定义int类型变量 a,b。都赋值为20
 * 定义布尔类型变量bo1，判断++a是否能被3整除，并且a++是否 能被7整除，结果赋值给bo1
 * 输出a、bo1的值
 * 定义布尔类型变量bo2，判断b++是否能被3整除，并且++b是否 能被7整除，结果赋值给bo2
 * 输出b、bo2的值
 */
public class LogicExer {
    public static void main(String[] args) {
        int a = 20, b = 20;

        /*boolean bo1 = false, bo2 = false;

        if ((++a % 3 == 0) && (a++ % 7 == 0)) {
            bo1 = true;
        }
        System.out.println("a=" + a + ",bo1=" + bo1); // 22,true

        if ((b++ % 3 == 0) && (++b % 7 == 0)) {
            bo2 = true;
        }
        System.out.println("b=" + b + ",bo2=" + bo2); // 21 ,false*/

        // && 的优先级高于 = ，所以不用担心先赋值的情况
        // 这样写也很不错
        boolean bo1 = (++a % 3 == 0) && (a++ % 7 == 0);
        System.out.println("a=" + a + ",bo1=" + bo1);

        boolean bo2 = (b++ % 3 == 0) && (++b % 7 == 0);
        System.out.println("b=" + b + ",bo2=" + bo2);
    }
}
