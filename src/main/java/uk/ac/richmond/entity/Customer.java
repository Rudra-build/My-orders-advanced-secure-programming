package uk.ac.richmond.entity;

import java.time.LocalDate;
import java.util.List;

public class Customer {

    private int id;
    private String first_name;
    private String last_name;
    private String contact;
    private LocalDate dob;
    private String address;
    private List<Order> orders;

    public Customer(int id, String first_name, String last_name, String contact, LocalDate dob, String address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.contact = contact;
        this.dob = dob;
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
