package org.ai88.chapter02;

public class AutomaticTypePromotion {
    public static void main(String[] args) {
        // long和float 结果是float
        long l1 = 123456l;
        float f1 = 12.34f;
        float f2 = l1 + f1;
        System.out.println(f2);

        // byte 、shourt、char 结果是int
        byte b1 = 12;
        short s1 = 23;
        char c1 = 'a'; // 97
        int i1 = b1+s1+c1;
        System.out.println(i1);

        // 整型常量都会被当作int类型
        // 浮点型常量会被当作double类型
        // long l2 = 123456789987; 123456789987 对于int类型来说超出了，所以会报错
        // float f3 = 1.1; 1.1 会被当作double，double --> float不是自动类型提升，需要使用我们后面的强制类型转换
    }
}
