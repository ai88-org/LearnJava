package org.ai88.chapter06.constructor.exer;

/**
 * 创建一个Customer，名字叫John Smith，他有一个账号为1000，余额为2000元，年利率为1.23%.
 * 对John Smith操作。
 *  存入100元，取出960元，再取出2000元
 *  打印出John Smith的基本信息
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer("John","Smith");
        Account a = new Account("1000",2000,0.0123);
        c.setAccount(a);

        c.getAccount().deposit(100);
        c.getAccount().withdraw(960);
        c.getAccount().withdraw(2000);

        System.out.println("Customer ["+c.getLastName()+","+c.getFirstName()+"] has an account: id is "+c.getAccount().
                getId()+",annualInterestRate is "+(c.getAccount().getAnnualInterestRate()*100)+"%,balance is "+c.getAccount().getBalance());
    }
}
