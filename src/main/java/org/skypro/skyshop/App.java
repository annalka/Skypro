package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;

public class App {
    public static void main(String[] args) {
        Product apple = new SimpleProduct("Яблоко", 100);
        Product bread = new SimpleProduct("Хлеб", 80);
        Product jacket = new DiscountedProduct("Куртка", 10000, 20);
        Product hat = new DiscountedProduct("Кепка", 1500, 10);
        Product mug = new FixPriceProduct("Кружка");
        Product extra = new SimpleProduct("Банан", 90);                   // лишний для проверки переполнения

        ProductBasket basket = new ProductBasket();

        System.out.println("--- Добавление продуктов в корзину ---");
        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(jacket);
        basket.addProduct(hat);
        basket.addProduct(mug);

        System.out.println("\n--- Попытка добавить продукт в заполненную корзину ---");
        basket.addProduct(extra); // «Невозможно добавить продукт»

        System.out.println("\n--- Печать содержимого корзины ---");
        basket.printBasket();

        System.out.println("\n--- Получение общей стоимости корзины ---");
        System.out.println("Общая стоимость: " + basket.getTotalCost());

        System.out.println("\n--- Поиск товара, который есть в корзине ---");
        System.out.println("Есть ли в корзине «Куртка»? " + basket.containsProductByName("Куртка"));

        System.out.println("\n--- Поиск товара, которого нет в корзине ---");
        System.out.println("Есть ли в корзине «Банан»? " + basket.containsProductByName("Банан"));

        System.out.println("\n--- Очистка корзины ---");
        basket.clear();

        System.out.println("\n--- Печать пустой корзины ---");
        basket.printBasket();
    }
}
