package org.ai88.chapter07.equals.exer1;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/9/1 12:29
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1001,"a");
        Order o2 = new Order(1001,"a");
        System.out.println(o1.equals(o2));
    }
}
