package com.bankingservice.service;

import com.bankingsystem.model.Account;
import com.bankingsystem.model.Benificiery;
import com.bankingsystem.model.Customer;
import com.bankingsystem.model.Transactions;

import java.util.Collection;
import java.util.List;

public interface BankingSercive {
    void AddCustomer(Customer c);
    void AddAccount(Account a);
    void AddTransaction(Transactions t);
    void AddBenefeciary(Benificiery b);

    Customer findCustomerById(int id);
    Account findAccountById(int id);
    Transactions findTransactionById(int id);
    Benificiery findBeneficiaryById(int id);

    Collection<Account> getAllAccounts();
    Collection<Customer> getAllCustomers();
    List<Account> getAccountsByCustomerId(int customerId);
    List<Transactions> getTransactionsByAccountId(int accountId);
    List<Benificiery> getBeneficiariesByCustomerId(int customerId);


}
