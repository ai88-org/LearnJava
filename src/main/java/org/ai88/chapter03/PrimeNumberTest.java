package org.ai88.chapter03;

/**
 * 找出100以内所有质数，1000000以内呢
 * 什么是质数，除了1和其本身外，不能被其他数整除的数就是质数，2是最小的质数
 * 开根号比除以2范围更小
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        for(int i=2;i<=1000000;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    System.out.println(i+"是质数...");
                    break;
                }
            }
        }
    }
}
