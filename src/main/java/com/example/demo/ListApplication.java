package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListApplication.class, args);

   /*     LinkedList ll = new LinkedList();
        ll.addAll(ordersList);
        System.out.println(ll.size());
        System.out.println(ll.clone());
        System.out.println(ll.getFirst());


        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i).toString());
        }*/
        ArrayListInr alprims = new ArrayListImpl();
        ArrayListObjectImpl alOrders = new ArrayListObjectImpl();
    }
}
