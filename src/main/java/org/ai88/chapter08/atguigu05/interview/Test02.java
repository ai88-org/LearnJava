package org.ai88.chapter08.atguigu05.interview;

/**
 * 阅读代码，分析运行结果
 *
 * @author 尚硅谷-宋红康
 * @create 16:02
 */
public class Test02 {
    static int x, y, z;

    static {
        // 局部
        int x = 5;
        x--; // 4
    }

    static {
        x--; // -1
    }

    public static void method() {
        // 先用-1，之后变成0
        y = z++ + ++z; // -1 + 1 = -1
        System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println("x=" + x); // -1
        z--; // -1
        method();
        System.out.println("result:" + (z + y + ++z)); // 1+0+2
    }


}
