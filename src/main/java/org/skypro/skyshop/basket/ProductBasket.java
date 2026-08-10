package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {
    private final Map<String, List<Product>> itemsByNames;

    public ProductBasket() {
        this.items = new LinkedList<>();
    }

    public void addProduct(Product product) {
        String name = product.getName();

        itemsByNames.computeIfAbsent(name, k -> new ArrayList<>()).add(product);
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

        return removedList;
    }

    public void printBasket() {
        Collection<List<Product>> allLists = itemsByNames.values();

        if (allLists.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        System.out.println("Содержимое корзины:");

        for (List<Product> products : allLists) {
            for (Product item : products) {
                System.out.println("- " + item.toString());
            }
        }
    }
}
