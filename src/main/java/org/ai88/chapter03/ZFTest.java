package org.ai88.chapter03;

/**
 * 珠穆朗玛峰高度是8848.86米
 * 一张纸厚度为0.1毫米
 * 假设这张纸足够大，折多少次能够达到珠穆朗玛峰的高度
 */
public class ZFTest {
    public static void main(String[] args) {
        int count = 0;
        double paperHeight = 0.0001;
        while(paperHeight < 8848.86){
            paperHeight *=2;
            count++;
        }
        System.out.println("一共需要折"+count+"次");
    }
}
