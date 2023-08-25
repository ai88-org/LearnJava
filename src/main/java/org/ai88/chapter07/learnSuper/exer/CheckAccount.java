package org.ai88.chapter07.learnSuper.exer;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/25 16:26
 */
public class CheckAccount extends Account {
    // 可透支限额
    private double overdraft;

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 1. 取款金额小于账号余额，直接调用父类的方法
     * 2. 取款金额大于账号余额：
     * 2.1 对冲完账号余额之后，剩余的钱小于等于透支额度，直接透支
     * 2.2 对冲完账户余额之后，剩余的钱大于透支额度，不允许透支
     *
     * @param amount 大于0
     */
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            //setBalance(getBalance() - amount);
            super.withdraw(amount);
        } else if (getBalance() + overdraft > amount) {
            amount -= getBalance();
            super.withdraw(getBalance());
            overdraft -= amount;
        }else{
            System.out.println("超过可透支限额");
        }
    }
}
