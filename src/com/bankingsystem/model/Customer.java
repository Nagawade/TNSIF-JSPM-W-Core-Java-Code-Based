package com.bankingsystem.model;

public class Customer {

    private int customer_id;
    private String name;
    private String address;
    private Long contact_number;


    public Customer(int customer_id, String name, String address, Long contact_number) {
        this.customer_id = customer_id;
        this.name = name;
        this.address = address;
        this.contact_number = contact_number;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Long getContact_number() {
        return contact_number;
    }


    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact_number(Long contact_number) {
        this.contact_number = contact_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact_number=" + contact_number +
                '}';
    }


}
