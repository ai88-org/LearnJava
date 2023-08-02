package org.ai88.chapter05;

import java.util.Arrays;

public class JustForSort {
    public static void main(String[] args) {
        int[] arr = {100,79,83,67,45};

        // 正宗冒泡排序
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        arr = new int[] {100,79,83,67,45};

        // 洋哥排序
        // 跳跃式排序
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
