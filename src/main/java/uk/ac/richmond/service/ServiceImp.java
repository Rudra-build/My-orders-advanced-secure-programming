package uk.ac.richmond.service;

import uk.ac.richmond.entity.Customer;
import uk.ac.richmond.entity.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServiceImp implements Service{
    private List<Order> orders;
    public ServiceImp()
    {
        orders = new ArrayList<>();

        //customer c and his/her orders
        Customer c = new Customer(2, "Jack", "Smith", "0777888787", LocalDate.of(2000, 2, 21), "121 Kings Road, SW6 5ER");
        Order o1 = new Order(4, LocalDate.of(2026, 2,19), c);
        Order o2 = new Order(60, LocalDate.of(2026, 2,20), c);

        orders.add(o1);
        orders.add(o2);

        //customer c2 and his/her orders

        Customer c2 = new Customer(2, "Suzan", "Stuarts", "0777888700", LocalDate.of(1988, 10, 1), "64 Fulham Road, SW6 4TY");
        Order o3 = new Order(35, LocalDate.of(2026, 2,17), c2);
        Order o4 = new Order(78, LocalDate.of(2026, 2,19), c2);

        orders.add(o3);
        orders.add(o4);

    }

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

    @Override
    public List<Order> getOrdersOfAPeriod(LocalDate from_, LocalDate to_) {
        return orders.stream()
                .filter(o -> !o.getDate().isAfter(to_) && !o.getDate().isBefore(from_))
                .toList();
    }

    @Override
    public  Order getById(int order_id) {
        return  orders.stream()
                .filter( o -> o.getId() == order_id)
                .findFirst()
                .orElse(null);


    }

    @Override
    public Customer getCustomerOfAnOrder(int order_id) {
        return orders.stream()
                .filter( o -> o.getId() ==  order_id)
                .map(Order::getCustomer)//map(o -> o.getCustomer())
                .findFirst()
                .orElse(null);
    }
    public LocalDate getDateOfOrder(Order order)
    {
        return orders.stream()
                .filter(o -> o.equals(order))
                .map( Order::getDate)
                .findFirst()
                .orElse(null);
    }

}
