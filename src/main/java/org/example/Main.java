package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА PRODUCT ===");

        Product p1 = new Product(101, "Ноутбук", 50000, "Электроника");
        Product p2 = new Product(102, "Мышь", 1500, "Электроника");
        Product p3 = new Product(101, "Другой ноутбук", 60000, "Электроника"); // тот же id и категория
        Product p4 = new Product(103, "Книга", 500, "Литература");
        Product p5 = new Product(101, "Другой ноутбук", 70000, "Электроника"); // ещё один дубликат
        Product p6 = new Product(104, "Телефон", 30000, "Электроника"); // другой id, та же категория

        System.out.println("Все товары:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        System.out.println("\nРЕЗУЛЬТАТЫ СРАВНЕНИЯ ТОВАРОВ:");

        System.out.println("p1 == p2: " + p1.equals(p2)); // false — разные id
        System.out.println("p1 == p3: " + p1.equals(p3)); // true — совпадают id и категория
        System.out.println("p1 == p4: " + p1.equals(p4)); // false — разные id и категория
        System.out.println("p1 == p5: " + p1.equals(p5)); // true — совпадают id и категория
        System.out.println("p1 == p6: " + p1.equals(p6)); // false — разные id, хотя категория та же
        System.out.println("p3 == p5: " + p3.equals(p5)); // true — совпадают id и категория

        System.out.println("\n=== ТЕСТИРОВАНИЕ КЛАССА ORDER ===");

        Product[] basket1 = {p1, p2};
        Product[] basket2 = {p1, p2}; // идентичная корзина
        Product[] basket3 = {p2, p1}; // та же корзина, но другой порядок
        Product[] basket4 = {p1, p2, p4}; // дополнительная позиция
        Product[] basket5 = {p1, p2}; // такая же, как basket1

        Order order1 = new Order("Иван Иванов", basket1);
        Order order2 = new Order("Иван Иванов", basket2); // идентичный заказ
        Order order3 = new Order("Пётр Петров", basket1); // другой покупатель
        Order order4 = new Order("Иван Иванов", basket3); // другой порядок товаров
        Order order5 = new Order("Иван Иванов", basket4); // другая корзина
        Order order6 = new Order("Иван Иванов", basket5); // идентичный order1

        System.out.println("Все заказы:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println(order5);
        System.out.println(order6);

        System.out.println("\nРЕЗУЛЬТАТЫ СРАВНЕНИЯ ЗАКАЗОВ:");

        System.out.println("order1 == order2: " + order1.equals(order2)); // true — полностью идентичны
        System.out.println("order1 == order3: " + order1.equals(order3)); // false — другой покупатель
        System.out.println("order1 == order4: " + order1.equals(order4)); // false — другой порядок товаров
        System.out.println("order1 == order5: " + order1.equals(order5)); // false — разная корзина
        System.out.println("order1 == order6: " + order1.equals(order6)); // true — полностью идентичны
    }
}

