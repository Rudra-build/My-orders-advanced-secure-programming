package uk.ac.richmond;

import uk.ac.richmond.entity.Customer;
import uk.ac.richmond.entity.Order;
import uk.ac.richmond.service.CustomerService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args)
    {
        CustomerService cs = c -> c.getOrders().size();

        Customer c = new Customer(2, "Jack", "Smith", "0777888787", LocalDate.of(2000, 2, 21), "121 Kings Road, SW6 5ER");
        Order o1 = new Order(4, LocalDate.of(2026, 2,19), c);
        Order o2 = new Order(60, LocalDate.of(2026, 2,20), c);
        List<Order> ords = new ArrayList<>();
        ords.add(o1);
        ords.add(o2);
        c.setOrders(ords);


        Integer num_of_ords = cs.returnNumOfOrdersPerCustomer(c);

        System.out.println("The number of orders for customer "
                +c.getLast_name() + " is: "+ num_of_ords);

    }
}
