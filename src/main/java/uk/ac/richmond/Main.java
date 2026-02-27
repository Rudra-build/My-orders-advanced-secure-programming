package uk.ac.richmond;

import uk.ac.richmond.entity.Customer;
import uk.ac.richmond.entity.Order;
import uk.ac.richmond.service.Service;
import uk.ac.richmond.service.ServiceImp;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Locale;

public class Main {


    public static void main(String[] args)
    {
        Service service = new ServiceImp();

        //service 1 (get all orders) sorted as well

        service.getAllOrders()
                .stream()
                .sorted(Comparator.comparing(Order::getId))
                .forEach(order -> System.out.println(order.getId() + " "
                        + order.getDate() + " "+ order.getCustomer().getFirst_name() + " "
                        +order.getCustomer().getLast_name()));
        System.out.println("***********************************************");


        //service 2 (get orders from a date to a date "both dates are inclusive")
        LocalDate to_ = LocalDate.now();
        LocalDate from_ =  LocalDate.of(2026, 2, 19);
        service.getOrdersOfAPeriod(from_, to_)
                .stream()
                .sorted(Comparator.comparing(Order::getDate))
                .forEach(o -> System.out.println(o.getId() + " "+ o.getDate()));


        System.out.println("***********************************************");

        //service 3 (get an order by ID)
        int id = 200;
        if(service.getById(id) != null) {
            Order order = service.getById(id);
            System.out.println(order.getId() + " " + order.getDate());
        }
        else{
            System.out.println("Sorry your ID does not exist");
        }
        System.out.println("***********************************************");

        //service 4 (getCustomerOfAnOrder)

        int order_id = 35;
        if(service.getCustomerOfAnOrder(order_id) != null)
        {
            Customer c = service.getCustomerOfAnOrder(order_id);
            System.out.println(c.getFirst_name() + " "+ c.getLast_name());
        }
        else{
            System.out.println("No such ID");

        }

    }
}

