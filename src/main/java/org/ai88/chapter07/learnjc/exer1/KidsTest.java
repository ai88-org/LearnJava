package org.ai88.chapter07.learnjc.exer1;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/23 17:51
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.sex = 1;
        someKid.salary = 1000;
        System.out.println(someKid.sex);
        System.out.println(someKid.salary);
        someKid.manOrWoman();
        someKid.employeed();
    }
}
