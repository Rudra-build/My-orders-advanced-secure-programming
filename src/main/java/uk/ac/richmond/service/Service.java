package uk.ac.richmond.service;

import uk.ac.richmond.entity.Customer;
import uk.ac.richmond.entity.Order;

import java.time.LocalDate;
import java.util.List;

//100% abstraction


public interface Service {
    public List<Order> getAllOrders();
    public List<Order> getOrdersOfAPeriod(LocalDate from_, LocalDate to_);//from_ and to_ are inclusive
    public Order getById(int order_id);
    public Customer getCustomerOfAnOrder(int order_id);


}
