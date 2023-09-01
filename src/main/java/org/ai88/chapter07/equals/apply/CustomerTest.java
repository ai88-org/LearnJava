package org.ai88.chapter07.equals.apply;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/9/1 11:19
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("张三",18,new Account(2000));
        Customer c2 = new Customer("张三",18,new Account(2000));
        System.out.println(c1.equals(c2)); // false的原因是Account类的equals方法没有重写
    }
}
