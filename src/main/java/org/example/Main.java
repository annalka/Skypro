package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА PRODUCT ===");

        Product p1 = new Product(1, "Ноутбук", 50000, "Электроника");
        Product p2 = new Product(2, "Смартфон", 30000, "Электроника");
        Product p3 = new Product(1, "Другой ноутбук", 60000, "Электроника"); // тот же id и категория
        Product p4 = new Product(3, "Книга", 1000, "Литература");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("\nРезультаты сравнения товаров:");
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // false
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // true
        System.out.println("p2.equals(p4): " + p2.equals(p4)); // false

        System.out.println("\n=== ТЕСТИРОВАНИЕ КЛАССА ORDER ===");

        Product[] basket1 = {p1, p2};
        Product[] basket2 = {p1, p2};
        Product[] basket3 = {p3, p4};

        Order order1 = new Order("Иван Иванов", basket1);
        Order order2 = new Order("Иван Иванов", basket2);
        Order order3 = new Order("Пётр Петров", basket3);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println("\nРезультаты сравнения заказов:");
        System.out.println("order1.equals(order2): " + order1.equals(order2)); // true
        System.out.println("order1.equals(order3): " + order1.equals(order3)); // false
        System.out.println("order2.equals(order3): " + order2.equals(order3)); // false
    }
}

