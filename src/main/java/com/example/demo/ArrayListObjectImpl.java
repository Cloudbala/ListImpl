package com.example.demo;

import java.util.*;

/**
 * Created by openc on 29/5/2017.
 */
public class ArrayListObjectImpl {

    ArrayList<Order> ordersList = null;

    public ArrayListObjectImpl() {

        ordersList = new ArrayList<>();
        insertOrderValues(ordersList);
        System.out.println(getMaxOrderValue(ordersList));
        printOrderValues(ordersList);
    }

    public void insertOrderValues(ArrayList<Order> ordersList) {
        ordersList.add(new Order(5, "fixed", 890654L));
        ordersList.add(new Order(6, "semifixed", 777579L));
        ordersList.add(new Order(1, "regular", 98657L));
        ordersList.add(new Order(7, "random", 8767657L));

    }

    public Long getMaxOrderValue(ArrayList<Order> list) {

        List<Long> valueList = new ArrayList();

        for (Order o : list) {
            valueList.add(o.getOrderValue());
        }
        Iterator<Long> itr = valueList.iterator();
        Long candidate = itr.next();
        while (itr.hasNext()) {
            Long next = itr.next();
            if (next.compareTo(candidate) > 0) {
                candidate = next;
            }
        }
        return candidate;
    }

    public void printOrderValues(ArrayList<Order> list) {
        for (Order o : ordersList) {
            System.out.println(o.getOrderNo());
            System.out.println(o.getOrderType());
            System.out.println(o.getOrderValue());
        }
    }


}