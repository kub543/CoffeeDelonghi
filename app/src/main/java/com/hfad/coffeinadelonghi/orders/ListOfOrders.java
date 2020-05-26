package com.hfad.coffeinadelonghi.orders;


import com.hfad.coffeinadelonghi.Coffee.Drink;

import java.util.ArrayList;
import java.util.List;

public class ListOfOrders {

        public static List<Order> orders = new ArrayList<>();

        private static void addOrder(Order order){
            orders.add(order);
        }

        public static void makeOrder(String name, Drink coffee){
            addOrder(new Order(name, coffee));
        }
    }

