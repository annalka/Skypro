package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        Product apple = new Product("Яблоко", 100);
        Product bread = new Product("Хлеб", 80);
        Product milk = new Product("Молоко", 120);
        Product cheese = new Product("Сыр", 300);
        Product eggs = new Product("Яйца", 150);
        Product chocolate = new Product("Шоколад", 200); // лишний продукт для проверки переполнения

        ProductBasket basket = new ProductBasket();

        System.out.println("--- Добавление продуктов в корзину ---");
        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(milk);
        basket.addProduct(cheese);
        basket.addProduct(eggs);

        System.out.println("\n--- Попытка добавить продукт в заполненную корзину ---");
        basket.addProduct(chocolate); // «Невозможно добавить продукт»

        System.out.println("\n--- Печать содержимого корзины ---");
        basket.printBasket();

        System.out.println("\n--- Получение общей стоимости корзины ---");
        int totalCost = basket.getTotalCost();
        System.out.println("Общая стоимость: " + totalCost);

        System.out.println("\n--- Поиск товара, который есть в корзине ---");
        boolean hasCheese = basket.containsProductByName("Сыр");
        System.out.println("Есть ли в корзине «Сыр»? " + hasCheese); // ожидается true

        System.out.println("\n--- Поиск товара, которого нет в корзине ---");
        boolean hasChocolate = basket.containsProductByName("Шоколад");
        System.out.println("Есть ли в корзине «Шоколад»? " + hasChocolate); // ожидается false

        System.out.println("\n--- Очистка корзины ---");
        basket.clear();

        System.out.println("\n--- Печать содержимого пустой корзины ---");
        basket.printBasket(); // «в корзине пусто»

        System.out.println("\n--- Получение стоимости пустой корзины ---");
        int emptyTotalCost = basket.getTotalCost();
        System.out.println("Стоимость пустой корзины: " + emptyTotalCost); // ожидается 0

        System.out.println("\n--- Поиск товара по имени в пустой корзине ---");
        boolean hasAppleInEmptyBasket = basket.containsProductByName("Яблоко");
        System.out.println("Есть ли в пустой корзине «Яблоко»? " + hasAppleInEmptyBasket); // ожидается false
    }
}

