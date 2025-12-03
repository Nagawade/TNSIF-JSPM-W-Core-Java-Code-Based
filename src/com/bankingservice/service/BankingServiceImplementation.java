package com.bankingservice.service;

import com.bankingsystem.model.Account;
import com.bankingsystem.model.Benificiery;
import com.bankingsystem.model.Customer;
import com.bankingsystem.model.Transactions;

import java.util.*;

public class BankingServiceImplementation implements BankingSercive {

    private final Map<Integer, Account> accounts = new HashMap<>();
    private final Map<Integer, Benificiery> beneficiaries = new HashMap<>();
    private final Map<Integer, Customer> customers = new HashMap<>();
    private final Map<Integer, Transactions> transactions = new HashMap<>();

    @Override
    public void AddCustomer(Customer c) {
        if (c == null) {
            throw new IllegalArgumentException("Customer does not exist");
        }

        int id = c.getCustomer_id(); // keep if your model uses getCustomer_id()
        if (customers.containsKey(id)) {
            throw new IllegalArgumentException("Customer already exists");
        }
        customers.put(id, c);
        System.out.println("Customer added successfully: " + c);
    }

    @Override
    public void AddBenefeciary(Benificiery b) {
        if (b == null) {
            throw new IllegalArgumentException("Benificiery does not exist");
        }

        int id = b.getBeneficiaryID();
        beneficiaries.put(id, b);
        System.out.println("Benificiery added successfully: " + b);
    }

    @Override
    public void AddAccount(Account a) {
        if (a == null) {
            throw new IllegalArgumentException("Account does not exist");
        }

        int id = a.getAccount_id();
        if (accounts.containsKey(id)) {
            throw new IllegalArgumentException("Account already exists");
        }
        accounts.put(id, a);
        System.out.println("Account added successfully: " + a);
    }

    @Override
    public void AddTransaction(Transactions t) {
        if (t == null) {
            throw new IllegalArgumentException("Transaction does not exist");
        }
        int t_id = t.getTransactionID();
        if (transactions.containsKey(t_id)) {
            throw new IllegalArgumentException("Transaction already exists");
        }
        transactions.put(t_id, t);
    }

    @Override
    public Account findAccountById(int id) {
        return accounts.get(id);
    }

    @Override
    public Transactions findTransactionById(int id) {
        return transactions.get(id);
    }

    @Override
    public Benificiery findBeneficiaryById(int id) {
        return beneficiaries.get(id);
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return new ArrayList<>(accounts.values());
    }

    @Override
    public Collection<Customer> getAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public List<Benificiery> getBeneficiariesByCustomerId(int customerId) {
        List<Benificiery> result = new ArrayList<>();

        for (Benificiery b : beneficiaries.values()) {

            if (b.getCustomerID() == customerId) {
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public List<Account> getAccountsByCustomerId(int customerId) {
        List<Account> result = new ArrayList<>();
        for (Account a : accounts.values()) {

            if (a.getCustomer_id() == customerId) {
                result.add(a);
            }
        }
        return result;
    }

    @Override
    public List<Transactions> getTransactionsByAccountId(int accountId) {
        List<Transactions> result = new ArrayList<>();
        for (Transactions t : transactions.values()) {

            if (t.getAccountID() == accountId) {
                result.add(t);
            }
        }
        return result;
    }
}
