package org.ai88.chapter07.learnSuper.exer;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/25 16:59
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
        System.out.println("余额为: " + checkAccount.getBalance() + "，可透支额度为：" + checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println("余额为: " + checkAccount.getBalance() + "，可透支额度为：" + checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println("余额为: " + checkAccount.getBalance() + "，可透支额度为：" + checkAccount.getOverdraft());
    }
}
