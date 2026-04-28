package org.example;

public class Main {

    {
        int clientOS = 0; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    {
        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientDeviceYear <= 2015) {

            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
    }

    {
        int year = 2021;

        if (year <= 1584) {
            System.out.println("Год должен быть больше, чем 1584.");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }

    {
        int deliveryDistance = 95;
        int deliveryDays = 0;

        if (deliveryDistance > 100) {
            System.out.println("Доставка невозможна");
        } else {
            if (deliveryDistance <= 20) {
                deliveryDays = 1;
            } else if (deliveryDistance <= 60) {
                deliveryDays = 2;
            } else if (deliveryDistance <= 100) {
                deliveryDays = 3;
            }

            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    {
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В году всего 12 месяцев");
        }
    }
}