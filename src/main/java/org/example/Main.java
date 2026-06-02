package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ ТОВАРОВ ===");

        Product p1 = new Product(101, "Ноутбук", 50000, "Электроника");
        Product p2 = new Product(102, "Мышь", 1500, "Электроника");
        Product p3 = new Product(101, "Другой ноутбук", 60000, "Электроника");
        Product p4 = new Product(103, "Книга", 500, "Литература");

        System.out.println("Товары:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("\nРезультаты сравнения товаров:");
        System.out.println("p1 == p2: " + p1.equals(p2)); // false
        System.out.println("p1 == p3: " + p1.equals(p3)); // true (совпадают id и категория)
        System.out.println("p1 == p4: " + p1.equals(p4)); // false

        // Тестирование класса Order
        System.out.println("\n=== ТЕСТИРОВАНИЕ ЗАКАЗОВ ===");

        Product[] basket1 = {p1, p2};
        Product[] basket2 = {p1, p2};
        Product[] basket3 = {p2, p1}; // другой порядок
        Product[] basket4 = {p1, p2, p4}; // дополнительный товар

        Order order1 = new Order("Иван Иванов", basket1);
        Order order2 = new Order("Иван Иванов", basket2);
        Order order3 = new Order("Пётр Петров", basket1); // другой покупатель
        Order order4 = new Order("Иван Иванов", basket3);
        Order order5 = new Order("Иван Иванов", basket4);

        System.out.println("Заказы:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println(order5);

        System.out.println("\nРезультаты сравнения заказов:");
        System.out.println("order1 == order2: " + order1.equals(order2)); // true
        System.out.println("order1 == order3: " + order1.equals(order3)); // false (другой покупатель)
        System.out.println("order1 == order4: " + order1.equals(order4)); // false (другой порядок)
        System.out.println("order1 == order5: " + order1.equals(order5)); // false (разные корзины)
    }
}
