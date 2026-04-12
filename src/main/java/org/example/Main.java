package org.example;

public class Main {
    {int a = 3333;
    byte b = 22;
    short c = 32000;
    long d = 1000000L;

    float e = 3.45f;
    double f = 3.000005;

    System.out.println("Значение переменной a с типом int равно" + a);
    System.out.println("Значение переменной b с типом byte равно" + b);
    System.out.println("Значение переменной c с типом short равно" + c);
    System.out.println("Значение переменной d с типом long равно" + d);
    System.out.println("Значение переменной e с типом float равно" + e);
    System.out.println("Значение переменной f с типом double равно" + f);
    }
    {
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }
    {
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;

        short paper = 480;
        int paperPerPeople = paper / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано" + paperPerPeople + "листов бумаги");
    }
    {
        short efficiencyPer2Min = 16;
        int efficiency_per_20_min = (efficiencyPer2Min / 2) * 20;
        System.out.println("За 20 минут машина произвела" + efficiency_per_20_min + "штук бутылок");

        int efficiencyPerDay = (efficiencyPer2Min / 2) * 24 * 60;
        System.out.println("За 1 день машина произвела" + efficiencyPerDay + "штук бутылок");

        int efficiencyPerThreeDays = (efficiencyPer2Min / 2) * 24 * 60 * 3;
        System.out.println("За 3 дня машина произвела" + efficiencyPerThreeDays + "штук бутылок");

        long efficiencyPerMonth = (efficiencyPer2Min / 2) * 24 * 60 * 30;
        System.out.println("За месяц машина произвела" + efficiencyPerMonth + "штук бутылок");
    }
    {
      short needPaint = 120;
      int whitePaint = needPaint / 3;
      int brownPaint = whitePaint * 2;

      int classes = needPaint / 6;

      System.out.println("В школе, где" + classes + "классов, нужно" + whitePaint+ "банок белой " +
              "краски и" + brownPaint + "банок коричневой краски");
    }
    {
        int bananas = 80;
        int milk = 105;
        int ice_cream = 100;
        int eggs = 70;

        float breakfastKg;
        breakfastKg = ((5 * bananas) + (2 * milk) + (2 * ice_cream) + (4 * eggs)) / 1000f;
        int breakfastG = (5 * bananas + 2 * milk + 2 * ice_cream + 4 * eggs);

        System.out.println(breakfastG + "- вес завтрака в граммах");
        System.out.println(breakfastKg + "- вес завтрака в килограммах");
    }
    {
     int weight = 7000;
     int loss1 = 250;
     int loss2 = 500;
     int mediumLoss =( loss1 + loss2 ) / 2;

     int dayLoss1 = weight / loss1;
     int dayLoss2 = weight / loss2;
     int dayLossMedium = weight / mediumLoss;

     System.out.println(dayLoss1 + "- столько дней потребуется, если сбрасывать 250 грамм в день");
     System.out.println(dayLoss2 + "- столько дней потребуется, если сбрасывать 500 грамм в день");
     System.out.println(dayLossMedium+ "- столько дней потребуется, если сбрасывать среднее" +
             "колличество грамм в день");
    }
    {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;


        float newSalaryMasha = 67760 + (67760 / 10f);
        float newSalaryDenis = 83690 + (83690 / 10f);
        float newSalaryKristina = 76230 + (76230 / 10f);

        float differenceMasha = 12* (newSalaryMasha - salaryMasha);
        float differenceDenis = 12* (newSalaryDenis - salaryDenis);
        float differenceKristina = 12 *(newSalaryKristina - salaryKristina);

        System.out.println("Маша теперь получает" + newSalaryMasha + "рублей." +
                "Годовой доход вырос на " + differenceMasha + "рублей");

        System.out.println("Денис теперь получает" + newSalaryDenis + "рублей." +
                "Годовой доход вырос на " + differenceDenis + "рублей");

        System.out.println("Кристина теперь получает" + newSalaryKristina + "рублей." +
                "Годовой доход вырос на " + differenceKristina + "рублей");

    }
}