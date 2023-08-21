package org.ai88.chapter07.learnThis.exer2;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customers[numberOfCustomer++] = customer;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * @param index 不能越界
     * @return
     */
    public Customer getCustomer(int index) {
        if (index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("张","三");
        bank.addCustomer("李","四");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);
        bank.getCustomer(0).getAccount().getBalance();
    }
}
