package org.ai88.chapter07.learnThis.exer2;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    /**
     * 存款
     * @param amt 必须为正的
     */
    public void deposit(double amt){
        if(amt <= 0){
            System.out.println("存款失败");
        }else{
            balance += amt;
            System.out.println("当前余额为："+balance);
        }
    }

    /**
     * 取款
     * @param amt 必须大于0，余额足够
     */
    public void withdraw(double amt){
        if(balance >= amt && amt > 0){
            balance -= amt;
            System.out.println("当前余额为："+balance);
        }else{
            System.out.println("余额不足");
        }
    }
}
