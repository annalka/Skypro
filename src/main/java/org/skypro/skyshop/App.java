package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        SimpleProduct simple = new SimpleProduct("Простой товар", 100);
        DiscountedProduct discounted = new DiscountedProduct("Товар со скидкой", 200, 20);
        FixPriceProduct fixPrice = new FixPriceProduct("Фикс-прайс товар");

        basket.addProduct(simple);
        basket.addProduct(discounted);
        basket.addProduct(fixPrice);

        basket.addProduct(new SimpleProduct("Ещё товар", 50));
        basket.addProduct(new SimpleProduct("И ещё один", 60));
        basket.addProduct(new SimpleProduct("Слишком много", 70));

        System.out.println("=== Содержимое корзины ===");
        basket.printBasket();
        System.out.println();


        System.out.println("Есть ли в корзине «Товар со скидкой»? " + basket.containsByName("Товар со скидкой"));
        System.out.println("Есть ли в корзине «Неизвестный товар»? " + basket.containsByName("Неизвестный товар"));
        System.out.println();

        basket.clear();
        System.out.println("=== После очистки корзины ===");
        basket.printBasket();
        System.out.println("Стоимость пустой корзины: " + basket.getTotalPrice());
        System.out.println();

        SearchEngine engine = new SearchEngine(20); // достаточно места под товары и статьи

        engine.add(simple);
        engine.add(discounted);
        engine.add(fixPrice);
        engine.add(new SimpleProduct("Другой простой товар", 80));

        // Создаём и добавляем статьи
        Article article1 = new Article("Как выбрать товар", "В этой статье расскажем, как правильно выбирать товары в нашем магазине.");
        Article article2 = new Article("Скидки и акции", "Узнайте, какие скидки и акции действуют прямо сейчас.");
        Article article3 = new Article("Новинки месяца", "Представляем новинки, которые вы не захотите пропустить.");

        engine.add(article1);
        engine.add(article2);
        engine.add(article3);

        searchAndPrint(engine, "товар");
        searchAndPrint(engine, "скидка");
        searchAndPrint(engine, "новинки");
        searchAndPrint(engine, "не существует");
    }

    private static void searchAndPrint(SearchEngine engine, String query) {
        System.out.println("=== Поиск по запросу: \"" + query + "\" ===");
        Searchable[] results = engine.search(query);
        boolean hasResult = false;

        for (Searchable item : results) {
            if (item != null) {
                hasResult = true;
                System.out.println(item.getStringRepresentation());
            }
        }

        if (!hasResult) {
            System.out.println("Ничего не найдено");
        }
        System.out.println();
    }
}
