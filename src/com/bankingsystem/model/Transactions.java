package com.bankingsystem.model;

import java.time.LocalDateTime;

public class Transactions {

    private int transactionID;
    private int accountID;
    private String type; // "Deposit"/"Withdrawal"/"Transfer"
    private double amount;
    private LocalDateTime timestamp;

    public Transactions(int transactionID, int accountID, String type, double amount, LocalDateTime timestamp) {
        this.transactionID = transactionID;
        this.accountID = accountID;
        this.type = type;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "transactionID=" + transactionID +
                ", accountID=" + accountID +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                '}';
    }
}
