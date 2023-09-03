package org.ai88.chapter08.exer1;

/**
 * Description:
 *
 *  编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 *  定义封装这些属性的方法。账号要自动生成。
 *
 * @Author xuyang
 * @Create 2023/9/3 20:12
 */
public class Account {
    private int id;
    private String password;
    private double balance;
    private static double interestRatio = 0.0123;
    private static double minBalance = 1;
    private static int init = 1001;

    public Account(){
        this.id = init;
        init ++;
        password = "123456";
    }

    public Account(double balance,String password){
        this();
        this.balance = balance;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRatio() {
        return interestRatio;
    }

    public static void setInterestRatio(double interestRatio) {
        Account.interestRatio = interestRatio;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
