package org.ai88.chapter03;

/**
 * 随机数的使用
 * Math.random() 区间在[0.0,1.0)
 * 公式：求[a,b]
 * (int)(Math.random()*(b-a+1))+a
 */
public class RandomTest {
    public static void main(String[] args) {
        // 获取[0,100]的随机整数
        System.out.println((int)(Math.random()*101));

        // 获取[1,100]的随机整数
        System.out.println((int) (Math.random() * 100 + 1));
    }
}
