package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private final Map<String, List<Product>> itemsByNames;

    public ProductBasket() {
        this.itemsByNames = new HashMap<>();
    }

    public void addProduct(Product product) {
        String name = product.getName();

        itemsByNames.computeIfAbsent(name, k -> new ArrayList<>()).add(product);
    }

    public List<Product> removeProductsByName(String name) {
        List<Product> removedList = itemsByNames.remove(name);

        if (removedList == null) {
            return Collections.emptyList();
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

    public List<Product> getAllProducts() {
        List<Product> all = new ArrayList<>();
        for (List<Product> list : itemsByNames.values()) {
            all.addAll(list);
        }
        return all;
    }
}
