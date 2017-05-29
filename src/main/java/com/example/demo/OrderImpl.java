package com.example.demo;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by openc on 28/5/2017.
 */
 class OrderImpl implements OrderInterface{

     public ArrayList<String> processOrder(ArrayList<String> orders){
        for (Object o:orders) {
            System.out.println("o = " + o);
        }
        return orders;
    }
}
