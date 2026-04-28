package org.example;

public class Main {
    {
        int clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
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
    } else{
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
            System.out.println("Год должен быть больше 1584.");
        } else {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }

    }
}
    {
        int deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            if (deliveryDistance >= 60){
                System.out.println("Потребуется 3 дня доставки");
            } else if (deliveryDistance >= 20) {
                 System.out.println("Потребуется 2 дня для доставки");
            }else{
                System.out.println("Потребуется 1 день для доставки");

        }
    }
    }
    {
        int monthNumber = 12;

        switch (monthNumber){
                case 1:
                System.out.println("Январь");
                    break;
                    case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
            default:
                System.out.println("В году всего 12 месяцев");
            }
    }
}