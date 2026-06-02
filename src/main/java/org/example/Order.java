package org.example;

import java.util.Arrays;
import java.util.Objects;

class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Order[customer=" + customer +
                ", basket=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Order other = (Order) obj;

        if (!Objects.equals(this.customer, other.customer)) return false;

        if (this.basket == null && other.basket == null) return true;
        if (this.basket == null || other.basket == null) return false;

        if (this.basket.length != other.basket.length) return false;

        for (int i = 0; i < this.basket.length; i++) {
            Product thisProduct = this.basket[i];
            Product otherProduct = other.basket[i];

            if (thisProduct == null && otherProduct == null) continue;
            if (thisProduct == null || otherProduct == null) return false;
            if (!thisProduct.equals(otherProduct)) return false;
        }

        return true;
    }
}

