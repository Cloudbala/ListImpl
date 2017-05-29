package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListApplication.class, args);
        ArrayList<Order> ordersList = new ArrayList<>();
        ordersList.add(new Order(5, "fixed", 890654L));
        ordersList.add(new Order(6, "semifixed", 777579L));
        ordersList.add(new Order(1, "regular", 98657L));
        ordersList.add(new Order(7, "random", 8767657L));
        for (Order o : ordersList) {
            if (o.getOrderValue() > 99568) {
                System.out.println(o.getOrderNo());
            }
        }
        LinkedList ll = new LinkedList();
        ll.addAll(ordersList);
        System.out.println(ll.size());
        System.out.println(ll.clone());
        System.out.println(ll.getFirst());


        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i).toString());
        }

    }
}
