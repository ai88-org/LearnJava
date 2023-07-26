package org.ai88.chapter02;

/**
 * String与基本数据类型做运算
 */
public class TestString1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        int num1 = 10;
        boolean bool = true;
        System.out.println(str1 + num1 + bool); // Hello10true

        // System.out.println(num1+bool+str1); 从左到右进行运算，int类型不能与布尔类型做加法操作
        System.out.println("*" + "\t" + "*");   // *	*
        System.out.println('*' + "\t" + "*");   // *	*
        System.out.println('*' + '\t' + "*");   // 51*
        System.out.println('*' + '\t' + '*');   // 93
    }
}
