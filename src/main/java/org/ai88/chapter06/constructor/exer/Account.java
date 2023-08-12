package org.ai88.chapter06.constructor.exer;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(String i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 取款方法
    public void withdraw(double amount) {
        if (balance < amount && amount > 0) {
            System.out.println("余额不足，取款失败");
        } else {
            balance = balance - amount;
            System.out.println("成功取出：" + amount + "元");
        }
    }

    // 存款方法
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}
