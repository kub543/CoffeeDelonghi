package com.hfad.coffeinadelonghi.orders;

import com.hfad.coffeinadelonghi.Coffee.Drink;

public class Order {
    String nameOfClient;
    Drink coffee;

    public Order(String nameOfClient, Drink coffee) {
        this.nameOfClient = nameOfClient;
        this.coffee = coffee;
    }


    public String getNameOfClient() {
        return nameOfClient;
    }

    public Drink getCoffee() {
        return coffee;
    }

    public void setCoffee(Drink coffee) {
        this.coffee = coffee;
    }
}
