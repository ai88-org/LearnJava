package org.ai88.chapter05.valuetransfer;

public class ValueTransfer {
    public static void main(String[] args) {
        // 基本数据类型值传递
        int m = 10;
        int n = m;

        m++;
        System.out.println("m=" + m + ",n=" + n);
        // 引用数据类型值传递
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;

        arr2[0] = 10;
        System.out.println(arr1[0]);
    }
}
