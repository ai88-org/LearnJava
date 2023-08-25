package org.ai88.chapter07.learnSuper.exer;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/25 10:59
 */
public class Account {
    // 账号编号
    private int id;
    // 余额
    private double balance;
    // 年利率
    private double annuallnterestRate;
    // 构造函数
    public Account(int id,double balance,double annuallnterestRate){
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }
    // getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    /**
     * 获取月利率
     * @return
     */
    public double getMonthlyInterest(){
        return annuallnterestRate / 12;
    }

    /**
     * 取钱
     * @param amount 大于0
     */
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("不符合规范");
            return;
        }
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("余额不足！");
        }
    }

    /**
     * 存钱
     * @param amount 大于0
     */
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("不符合规范");
            return;
        }
        balance += amount;
        System.out.println("当前余额为："+balance);
    }
}
