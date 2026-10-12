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
            new SimpleProduct("Товар", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймана ошибка валидации: " + e.getMessage());
        }

        System.out.println("\n=== Создание объектов ===");

        SimpleProduct simple1 = new SimpleProduct("Простой товар", 100);
        SimpleProduct simple2 = new SimpleProduct("Простой товар", 150);

        DiscountedProduct discounted = new DiscountedProduct("Товар со скидкой", 200, 20);
        FixPriceProduct fixPrice = new FixPriceProduct("Фикс-прайс товар");

        Article article1 = new Article("Как выбрать товар", "В этой статье расскажем, как правильно выбирать товары.");
        Article article2 = new Article("Скидки", "Скидки и акции действуют сейчас.");
        Article article3 = new Article("Как выбрать товар", "Дублирующая статья");

        System.out.println("\n=== Работа корзины ===");
        ProductBasket basket = new ProductBasket();

        basket.addProduct(simple1);
        basket.addProduct(simple2);
        basket.addProduct(discounted);
        basket.addProduct(fixPrice);

        System.out.println("\n--- Удаление существующего продукта 'Простой товар' ---");
        List<Searchable> removedExisting = basket.removeProductsByName("Простой товар");

        System.out.println("Удаленные продукты (" + removedExisting.size() + " шт.):");
        removedExisting.forEach(p -> System.out.println("- " + p.toString()));

        System.out.println("\nСодержимое корзины после удаления:");
        basket.printBasket();

        System.out.println("\n=== Работа поиска ===");
        SearchEngine engine = new SearchEngine();

        engine.add(simple1);
        engine.add(simple2);
        engine.add(discounted);
        engine.add(fixPrice);

        engine.add(article1);
        engine.add(article2);
        engine.add(article3);

        String query = "товар";
        java.util.Set<Searchable> results = engine.search(query);

        System.out.println("\nРезультаты поиска '" + query + "':");
        if (results.isEmpty()) {
            System.out.println("Ничего не найдено.");
        } else {
            int index = 1;
            for (Searchable item : results) {
                System.out.println((index++) + ". " + item.toString());
            }
        }

        System.out.println("\n=== Тест findBestMatch ===");
        try {
            Searchable best = engine.findBestMatch("товар");
            System.out.println("Лучший результат: " + best.toString());
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }
}
