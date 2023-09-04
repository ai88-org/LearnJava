package org.ai88.chapter08.singleton;

/**
 * 单例饿汉模式
 */
public class Bank {
    private Bank(){}
    private static Bank instance = new Bank();
    public static Bank getInstance(){
        return instance;
    }
}

class BankTest{
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1 == b2);
    }
}