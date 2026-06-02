package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    // Конструктор
    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    // Геттеры
    public String getCustomer() {
        return customer;
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "Заказ[покупатель=" + customer +
                ", корзина=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Order order = (Order) obj;

        if (!Objects.equals(customer, order.customer)) return false;

        Product[] thisBasket = this.basket;
        Product[] otherBasket = order.basket;

        if (thisBasket == null && otherBasket == null) return true;
        if (thisBasket == null || otherBasket == null) return false;

        if (thisBasket.length != otherBasket.length) return false;

        for (int i = 0; i < thisBasket.length; i++) {
            Product thisProduct = thisBasket[i];
            Product otherProduct = otherBasket[i];

            if (thisProduct == null && otherProduct == null) continue;
            if (thisProduct == null || otherProduct == null) return false;

            if (!thisProduct.equals(otherProduct)) return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(customer);
        result = 31 * result + Arrays.hashCode(basket);
        return result;
    }
}

