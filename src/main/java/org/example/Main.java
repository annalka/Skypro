package org.example;

public class Main {

    {
        for (int numbers = 1; numbers <=10; numbers++){
            System.out.println("Номер"+ numbers);
        }
    }
    {
        for(int number =10; number >0; number--){
            System.out.println("Номер" + number);
        }
    }
    {
        for (int evenNumbers = 0; evenNumbers <=17; evenNumbers= evenNumbers + 2){
            System.out.println("Четные числа"+ evenNumbers);
        }
    }
    {
        for (int chain = 10; chain >= -10; chain-- ){
            System.out.println("Номер"+ chain);
        }
    }
    {
        for (int year = 1904; year <= 2096; year = year + 4){
            System.out.println("Високосный год"+year);
        }
    }
    {
        for (int number = 7; number<=98; number = number +7){
            System.out.println(number);
        }
    }
    {
        for (int number = 1; number <= 256; number = number*2){
            System.out.println(number);
        }
    }
    {
        int money = 29000;
        int haveMoney = 0;

        for (int i = 0; i <= 12; i++){
            haveMoney = haveMoney + money;
            System.out.println("Месяц" + i+ "сумма накоплений равна" + haveMoney);
        }
    }
    {
        int haveMoney = 29000;

        for (int i = 1; i <= 12; i++){
            haveMoney = haveMoney + haveMoney/100;
            System.out.println("Месяц" + i+ "сумма накоплений равна" + haveMoney);
        }
    }
    {
        for (int i = 1; i <=10; i = i*2){
            System.out.println(i);
        }
        }
    }