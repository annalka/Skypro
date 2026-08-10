package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Searchable;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
    private final List<Searchable> items = new ArrayList<>();

    public void addProduct(Searchable product) {
        items.add(product);
    }

    public List<Searchable> removeProductsByName(String name) {
        List<Searchable> removed = new ArrayList<>();
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).getName().equals(name)) {
                removed.add(items.remove(i));
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
        for (Searchable item : items) {
            System.out.println("- " + item.toString());
        }
    }

    public List<Searchable> getItems() {
        return items;
    }
}
