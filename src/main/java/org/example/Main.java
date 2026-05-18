package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        {
            int firstFriday = 3;

            for (int day = 1; day <= 31; day++) {
                if ((day - firstFriday) % 7 == 0 && day >= firstFriday) {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                }
            }
        }
        {
            int totalDistance = 42195;
            final int checkpointInterval = 500;
            int coveredDistance = 0;

            do {
                int remainingDistance = totalDistance - coveredDistance;
                System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
                coveredDistance += checkpointInterval;
            } while (coveredDistance <= totalDistance);
            for (coveredDistance = 0; coveredDistance <= totalDistance; coveredDistance += checkpointInterval) {
                int remainingDistance = totalDistance - coveredDistance;
                System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
            }
        }
        {
            int budget = 500;
            int day = 0;
            int remainingBudget = budget;

            while (remainingBudget >= 100 || (day % 5 == 0 && remainingBudget > 0)) {
                day++;
                if (day % 5 == 0) {
                    System.out.println("День " + day + ": бесплатный день парковки (5‑й день)");
                    continue;
                }
                if (remainingBudget >= 100) {
                    remainingBudget -= 100;
                    System.out.println("День " + day + ": списано 100 руб., осталось " + remainingBudget + " руб.");
                } else {
                    break;
                }
            }
            System.out.println("Итого: на " + budget + " руб. можно припарковаться на " + day + " дней.");

            int newBudget = 500;
            int totalDays = 0;
            int newRemainingBudget = newBudget;

            for (int newDay = 1; ; newDay++) {
                if (newDay % 5 == 0) {
                    totalDays++;
                    continue;
                }
                if (newRemainingBudget < 100) {
                    break;
                }
                newRemainingBudget -= 100;
                totalDays++;
            }
            System.out.println("При бюджете " + budget + " руб. автомобиль можно оставить на " + totalDays + " дней.");
        }
        }
        {
            int month = 0;
            double total = 0.0;

            while (true) {
                month++;
                total += 15000;

                if (month % 6 == 0) {
                    double interest = total * 0.07; // 7 % от текущей суммы
                    total += interest;
                    System.out.printf("Месяц %d: +15 000 руб., +%.2f руб. (7 %% процентов) → Итого: %.2f руб.%n",
                            month, interest, total);
                } else {
                    System.out.printf("Месяц %d: +15 000 руб. → Итого: %.2f руб.%n", month, total);
                }

                if (total >= 12000000) {
                    break;
                }
            }

            System.out.println("Цель достигнута! Для накопления 12 000 000 руб. потребовалось " + month + " месяцев.");
        }
        {
            int charge = 20;
            int minute = 0;
            int overheats = 0;

            while (charge < 100 && overheats <= 3) {
                minute++;
                if (minute % 10 == 0) {
                    overheats++;
                    if (overheats > 3) {
                        break;
                    }

                    System.out.println("Перегрев на " + minute + "-й минуте. Зарядка приостановлена на 2 минуты.");
                    minute += 2;
                    continue;
                }
                charge += 2;
                System.out.println("Минута " + minute + ": заряд — " + charge + " %");
            }
            if (overheats > 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + " %");
            } else {
                System.out.println("Зарядка завершена! Полный заряд достигнут.");
            }

            System.out.println("Время зарядки составило " + minute + " минут.");
        }
    }