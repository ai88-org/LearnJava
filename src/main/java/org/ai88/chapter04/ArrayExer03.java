package org.ai88.chapter04;

/**
 * 定义int类型数组，包含10个元素，分别赋值随机整数，范围为[10,99]。
 * 求出所有元素的最大值，最小值，总和 并输出出来
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        // 动态声明数组
        int[] arr = new int[10];

        // 赋值 、总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }

        // 求最大值 求最小值
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        // 平均数
        int avg = sum / arr.length;

        // 输出
        System.out.println("总和是：" + sum);
        System.out.println("平均数是：" + avg);
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
    }
}
