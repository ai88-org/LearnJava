package org.ai88.chapter02;

/**
 * 案例1 定义圆周率并赋值为3.14，现有3个圆的半径为1.2、2.5、6，求它们的面积
 * 案例2 将华氏温度80度转换成摄氏度，转换公式为：摄氏度=(华氏温度-32)/1.8
 */
public class FloatDoubleExer {
    public static void main(String[] args) {
        // 案例一
        double pi = 3.14;
        double r1 = 1.2;
        double r2 = 2.5;
        double r3 = 6;
        double s1 = r1 * r1 * pi;
        double s2 = r2 * r2 * pi;
        double s3 = r3 * r3 * pi;

        System.out.println("s1=" + s1 + ",s2=" + s2 + ",s3=" + s3);

        // 案例二
        double fahrenheit = 80;
        double celsius = (fahrenheit - 32)/1.8;
        System.out.println(celsius);
    }
}
