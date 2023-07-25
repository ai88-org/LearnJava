package org.ai88.chapter02;

/**
 * 强制类型转换
 */
public class TypeCasting {
    public static void main(String[] args) {
        // 一般情况
        long l1 = 12345l;
        short s1 = (short)l1;
        System.out.println(l1);

        // 精度缺失
        double d1 = 12.34;
        int i1 = (int)d1;
        System.out.println(i1);

        // 数据丢失
        int i2 = 128;
        byte b1 = (byte)i2;
        System.out.println(b1); // -128
    }
}
