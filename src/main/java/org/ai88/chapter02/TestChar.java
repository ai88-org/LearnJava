package org.ai88.chapter02;

public class TestChar {
    public static void main(String[] args) {
        // 表示形式1：使用一对''表示，内部有且仅有一个字符
        char c1 = 'a';
        char c2 = '中';
        char c3 = '1'; // 字符1，并不是数字1
        char c4 = '%';

        // 表示形式2：直接使用unicode值
        char c8 = '\u0036';
        System.out.println(c8);

        // 表示形式3：使用转义字符 可以识别出来
        char c9 = '\t';
        System.out.println("hello"+c9+"world");

        // 表示形式4
        char c10 = 97;
        System.out.println(c10); // 对应的字符
        System.out.println(c10+10); // 107 就不打印对应字符类，变成int类型的计算了
    }
}
