package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListApplication.class, args);

        ArrayListInr alprims = new ArrayListImpl();
       // ArrayListObjectImpl alOrders = new ArrayListObjectImpl();
    }
}
