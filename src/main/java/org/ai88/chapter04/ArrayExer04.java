package org.ai88.chapter04;

public class ArrayExer04 {
    public static void main(String[] args) {
        int[] arr1, arr2;
        // arr1为8个素数
        arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        // 赋值arr2变量等于arr1
        // 给的是首地址，所以改arr2也会变arr1
        arr2 = arr1;

        for (int i = 0; i < arr2.length; i++) {
            if(i%2==0){
                arr2[i] = i;
            }
        }
        System.out.println();
        // 应该是会变的
        for (int i : arr1) {
            System.out.print(i+" ");
        }
    }
}
