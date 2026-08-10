package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Проверка валидации данных ===");

        try {
            new SimpleProduct("", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймана ошибка валидации: " + e.getMessage());
        }

        try {
            new SimpleProduct("Товар", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймана ошибка валидации: " + e.getMessage());
        }

        SimpleProduct simple1 = new SimpleProduct("Простой товар", 100);
        SimpleProduct simple2 = new SimpleProduct("Простой товар", 150);
        DiscountedProduct discounted = new DiscountedProduct("Товар со скидкой", 200, 20);
        FixPriceProduct fixPrice = new FixPriceProduct("Фикс-прайс товар");

        System.out.println("\n=== Работа корзины (LinkedList) ===");
        ProductBasket basket = new ProductBasket();

        basket.addProduct(simple1);
        basket.addProduct(simple2);
        basket.addProduct(discounted);
        basket.addProduct(fixPrice);

        System.out.println("\n--- Удаление существующего продукта 'Простой товар' ---");
        List<Product> removedExisting = basket.removeProductsByName("Простой товар");

        System.out.println("Удаленные продукты:");
        if (removedExisting.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (Product p : removedExisting) {
                System.out.println("- " + p.toString());
            }
        }

        System.out.println("\nСодержимое корзины после удаления:");
        basket.printBasket();

        System.out.println("\n--- Удаление несуществующего продукта 'Неизвестный товар' ---");
        List<Product> removedNonExisting = basket.removeProductsByName("Неизвестный товар");

        System.out.println("Удаленные продукты:");
        if (removedNonExisting.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (Product p : removedNonExisting) {
                System.out.println("- " + p.toString());
            }
        }

        System.out.println("\nСодержимое корзины (должно остаться без изменений):");
        basket.printBasket();

        System.out.println("\n=== Работа поиска (Все результаты в List) ===");
        SearchEngine engine = new SearchEngine();
        engine.add(simple1);
        engine.add(simple2);
        engine.add(discounted);
        engine.add(fixPrice);

        Article article1 = new Article("Как выбрать товар", "В этой статье расскажем, как правильно выбирать товары. Товар товар товар.");
        Article article2 = new Article("Скидки", "Скидки и акции действуют сейчас.");
        engine.add(article1);
        engine.add(article2);

        List<Searchable> results = engine.search("товар");
        System.out.println("\nРезультаты поиска 'товар' (все совпадения):");

        if (results.isEmpty()) {
            System.out.println("Ничего не найдено.");
        } else {
            for (Searchable r : results) {
                System.out.println("- " + r.toString());
            }
        }

        System.out.println("\n=== Тест findBestMatch ===");
        try {
            Searchable best = engine.findBestMatch("товар");
            System.out.println("Лучший результат: " + best.toString());
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }

        try {
            engine.findBestMatch("несуществующий_запрос");
        } catch (BestResultNotFound e) {
            System.out.println("Ожидаемая ошибка: " + e.getMessage());
        }
    }
}
