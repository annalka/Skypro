package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {
    private final List<Product> items;

    public ProductBasket() {
        this.items = new LinkedList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public List<Product> removeProductsByName(String name) {
        List<Product> removed = new ArrayList<>();
        Iterator<Product> iterator = items.iterator();
        while (iterator.hasNext()) {
            Product current = iterator.next();
            if (current.getName().equals(name)) {
                removed.add(current);
                iterator.remove();
            }
        }

        return removed;
    }

    public void printBasket() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        System.out.println("Содержимое корзины:");
        for (Product item : items) {
            System.out.println("- " + item.toString());
        }
    }
}
