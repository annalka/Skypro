package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] items;
    private int count;

    public ProductBasket() {
        items = new Product[5];
        count = 0;
    }

    public void addProduct(Product product) {
        if (count >= items.length) {
            System.out.println("Невозможно добавить продукт");
            return;
        }
        items[count] = product;
        count++;
    }

    public int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            if (items[i] != null) {
                total += items[i].getPrice();
            }
        }
        return total;
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("в корзине пусто");
            System.out.println("Итого: 0");
            System.out.println("Специальных товаров: 0");
            return;
        }

        int specialCount = 0;

        for (int i = 0; i < count; i++) {
            Product p = items[i];
            if (p != null) {
                System.out.println(p.toString());
                if (p.isSpecial()) {
                    specialCount++;
                }
            }
        }

        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Специальных товаров: " + specialCount);
    }

    public boolean containsByName(String name) {
        for (int i = 0; i < count; i++) {
            if (items[i] != null && items[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
        count = 0;
    }
}
