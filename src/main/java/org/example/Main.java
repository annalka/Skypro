package org.example;

public class Main {
    {int a = 3333;
    byte b = 22;
    short c = 32000;
    long d = 1000000;

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
        long b = 987678965549;
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
        int paper_per_people = paper / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано" + paper_per_people + "листов бумаги");
    }
    {
        short efficiency_per_2_min = 16;
        int efficiency_per_20_min = (efficiency_per_2_min / 2) * 20;
        System.out.println("За 20 минут машина произвела" + efficiency_per_20_min + "штук бутылок");

        int efficiency_per_day = (efficiency_per_2_min / 2) * 24 * 60;
        System.out.println("За 20 минут машина произвела" + efficiency_per_day + "штук бутылок");

        int efficiency_per_three_days = (efficiency_per_2_min / 2) * 24 * 60 * 3;
        System.out.println("За 20 минут машина произвела" + efficiency_per_three_days + "штук бутылок");

        long efficiency_per_month = (efficiency_per_2_min / 2) * 24 * 60 * 30;
        System.out.println("За 20 минут машина произвела" + efficiency_per_month + "штук бутылок");
    }
    {
      short need_paint = 120;
      int white_paint = need_paint / 3;
      int brown_paint = white_paint * 2;

      int classes = need_paint / (white_paint + brown_paint);

      System.out.println("В школе, где" + classes + "классов, нужно" + white_paint+ "банок белой " +
              "краски и" + brown_paint + "банок коричневой краски");
    }
    {
        int bananas = 80;
        int milk = 105;
        int ice_cream = 100;
        int eggs = 70;

        float breakfast_kg;
        breakfast_kg = ((5 * bananas) + (2 * milk) + (2 * ice_cream) + (4 * eggs)) / 1000f;
        int breakfast_g = (5 * bananas + 2 * milk + 2 * ice_cream + 4 * eggs);

        System.out.println(breakfast_g + "- вес завтрака в граммах");
        System.out.println(breakfast_kg + "- вес завтрака в килограммах");
    }
    {
     int weight = 7000;
     int loss1 = 250;
     int loss2 = 500;
     int medium_loss =( loss1 + loss2 ) / 2;

     int day_loss1 = weight / loss1;
     int day_loss2 = weight / loss2;
     int day_loss_medium = weight / medium_loss;

     System.out.println(day_loss1 + "- столько дней потребуется, если сбрасывать 250 грамм в день");
     System.out.println(day_loss2 + "- столько дней потребуется, если сбрасывать 500 грамм в день");
     System.out.println(day_loss_medium+ "- столько дней потребуется, если сбрасывать среднее" +
             "колличество грамм в день");
    }
    {
        int salary_Masha = 67760;
        int salary_Denis = 83690;
        int salary_Kristina = 76230;


        float new_salary_Masha = 67760 + (67760 / 10f);
        float new_salary_Denis = 83690 + (83690 / 10f);
        float new_salary_Kristina = 76230 + (76230 / 10f);

        float difference_Masha = 12* (new_salary_Masha - salary_Masha);
        float difference_Denis = 12* (new_salary_Denis - salary_Denis);
        float difference_Kristina = 12 *(new_salary_Kristina - salary_Kristina);

        System.out.println("Маша теперь получает" + new_salary_Masha + "рублей." +
                "Годовой доход вырос на " + difference_Masha + "рублей");

        System.out.println("Денис теперь получает" + new_salary_Denis + "рублей." +
                "Годовой доход вырос на " + difference_Denis + "рублей");

        System.out.println("Кристина теперь получает" + new_salary_Kristina + "рублей." +
                "Годовой доход вырос на " + difference_Kristina + "рублей");

    }
}