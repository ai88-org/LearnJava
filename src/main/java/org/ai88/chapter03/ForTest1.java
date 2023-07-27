package org.ai88.chapter03;

/**
 * 输出所有的水仙花数
 * 水仙花树指一个3位数，各个位上的立方和等于其本身
 */
public class ForTest1 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; ++i) {
            int bai = i / 100;
            int shi = i % 100 / 10;
            int ge = i % 100 % 10;
            if(bai*bai*bai + shi * shi * shi + ge* ge *ge==i){
                System.out.println("找到一个水仙花数为:"+i);
            }
        }
    }
}
