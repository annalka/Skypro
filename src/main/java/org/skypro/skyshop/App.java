package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

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

        SimpleProduct simple = new SimpleProduct("Простой товар", 100);
        DiscountedProduct discounted = new DiscountedProduct("Товар со скидкой", 200, 20);
        FixPriceProduct fixPrice = new FixPriceProduct("Фикс-прайс товар");

        System.out.println("\n=== Работа корзины ===");
        ProductBasket basket = new ProductBasket();
        basket.addProduct(simple);
        basket.addProduct(discounted);
        basket.addProduct(fixPrice);
        basket.printBasket();

        System.out.println("\n=== Работа поиска ===");
        SearchEngine engine = new SearchEngine(20);
        engine.add(simple);
        engine.add(discounted);
        engine.add(fixPrice);

        Article article1 = new Article("Как выбрать товар", "В этой статье расскажем, как правильно выбирать товары. Товар товар товар.");
        Article article2 = new Article("Скидки", "Скидки и акции действуют сейчас.");
        engine.add(article1);
        engine.add(article2);

        Searchable[] results = engine.search("товар");
        System.out.println("Результаты поиска 'товар':");
        for (Searchable r : results) {
            if (r != null) System.out.println("- " + r.getStringRepresentation());
        }

        System.out.println("\n=== Тест findBestMatch ===");
        try {
            Searchable best = engine.findBestMatch("товар");
            System.out.println("Лучший результат: " + best.getStringRepresentation());
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
