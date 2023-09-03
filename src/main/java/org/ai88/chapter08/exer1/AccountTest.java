package org.ai88.chapter08.exer1;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/9/3 20:12
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        System.out.println(acct1);

        Account acct2 = new Account(2000,"123457");
        System.out.println(acct2);

        Account.setInterestRatio(0.0125);
        Account.setMinBalance(10);

        System.out.println("银行存款的利率为：" + Account.getInterestRatio());
        System.out.println("银行最小存款额度为：" + Account.getMinBalance());
    }
}
