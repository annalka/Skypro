package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
    private final List<Product> items;

    public ProductBasket() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public List<Product> removeProductsByName(String name) {
        List<Product> removed = new ArrayList<>();
        for (Product item : items) {
            if (item.getName().equals(name)) {
                removed.add(item);
            }
        }
        items.removeAll(removed);

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

    public List<Product> getItems() {
        return new ArrayList<>(items);
    }
}
