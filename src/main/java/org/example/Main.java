package org.example;
import java.time.LocalDate;
public class Main {

    public static class LeapYearChecker {

        public static void checkLeapYear(int year) {
            boolean isLeap = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = true;
                    } else {
                        isLeap = false;
                    }
                } else {
                    isLeap = true;
                }
            } else {
                isLeap = false;
            }

            if (isLeap) {
                System.out.println(year + " год — високосный год");
            } else {
                System.out.println(year + " год — невисокосный год");
            }
        }

        public static void recommendAppVersion(int osType, int clientDeviceYear) {
            int currentYear = LocalDate.now().getYear();
            boolean isLightVersionNeeded = clientDeviceYear < 2015 || clientDeviceYear > currentYear;
            String message;

            if (osType == 0) { // iOS
                if (isLightVersionNeeded) {
                    message = "Установите облегченную версию приложения для iOS по ссылке";
                } else {
                    message = "Установите приложение для iOS по ссылке";
                }
            } else if (osType == 1) { // Android
                if (isLightVersionNeeded) {
                    message = "Установите облегченную версию приложения для Android по ссылке";
                } else {
                    message = "Установите приложение для Android по ссылке";
                }
            } else {
                message = "Неподдерживаемая операционная система";
            }

            System.out.println(message);
        }

        public static void calculateDeliveryDays(int deliveryDistance) {
            int days;

            if (deliveryDistance > 100) {
                System.out.println("Доставка на расстояние " + deliveryDistance + " км невозможна");
                return;
            } else if (deliveryDistance <= 20) {
                days = 1;
            } else if (deliveryDistance <= 60) {
                days = 2;
            } else {
                days = 3;
            }

            System.out.println("Потребуется дней: " + days);
        }

        public static void main(String[] args) {
            int year = 2021;
            checkLeapYear(year);

            int clientDeviceYear = 2015;
            recommendAppVersion(0, clientDeviceYear);
            recommendAppVersion(1, 2014);
            recommendAppVersion(0, 2025);
            recommendAppVersion(1, 2020);

            int deliveryDistance = 95;
            calculateDeliveryDays(deliveryDistance);
        }
    }
}
