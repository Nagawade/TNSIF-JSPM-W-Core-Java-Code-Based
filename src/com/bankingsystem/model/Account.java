package com.bankingsystem.model;

public class Account {
    private int account_id;
    private int customer_id;
    private String type;
    private double balance;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Accoount{" +
                "account_id=" + account_id +
                ", customer_id=" + customer_id +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }

}
