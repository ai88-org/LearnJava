package org.ai88.chapter03;

import java.util.Scanner;

/**
 * 随机生成一个100以内的数，猜这个随机数是多少
 * 如果猜大了提示大了，小了就提示小了，猜对了提示猜对了，并输出一共猜了多少次
 */
public class GuessNumber {
    public static void main(String[] args) {
        // 公式[a,b] (int)(Math.random()*(b-a+1)+a)
        // [0,100]
        int guessNumber = (int)(Math.random()*101);
        //boolean flag = true;
        Scanner scan = new Scanner(System.in);
        int guessCount = 0;

        while(true){
            System.out.print("请输入: ");
            int myNum = scan.nextInt();
            if(myNum > guessNumber){
                System.out.println("大了");
            }else if(myNum < guessNumber){
                System.out.println("小了");
            }else{
                System.out.println("对了");
                break;
            }
            guessCount++;
        }
        System.out.println("恭喜，猜的数字为："+guessNumber+"，一共猜了"+guessCount+"次");
    }
}
