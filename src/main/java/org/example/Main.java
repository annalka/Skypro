package org.example;

public class Main {
    {
        int age = 18;
        if (age >=18){
            System.out.println("ВЫ - совершеннолетний");

        } else {
            System.out.println("Вы - несовершеннолетний");
        }
    }
    {
        int temperature = 7;
        if (temperature >= 5){
            System.out.println("Cегодня тепло, шапка не нужна");
        }else {
            System.out.println("Cегодня холодно, надень шапку");
        }
    }
    {
        int speed = 55;
        if (speed <= 60){
            System.out.println("Скорость в норме");
        }else {
            System.out.println("Cкорость превышена, вам штраф");
    }
    }
    {
        int age = 16;
        if ((age >= 2) && (age<=6 )){
            System.out.println("Вам следует пройти в детский сад");
        } else if ((age>= 7) && (age <=17)) {
            System.out.println("Вам в школу пройти");
        } else if ((age>=18) && (age <=24)) {
            System.out.println("Вам в ВУЗ надо");
        } else if (age> 24) {
            System.out.println("Вам на работу пора");
        }
    }
    {
        int age=8;
        if (age <5){
            System.out.println("Вам нельзя кататься на атракционе");
        } else if ((age >=5)&&(age <=14)) {
            System.out.println("Вам можно кататься только в споровождении взрослого");
        }else{
            System.out.println("Вам можно кататься на атракционе без взрослых");
        }
    }
    {
        int amount = 88;
        if(amount <=60){
            System.out.println("В вагоне есть сидячие места");
        } else if ((amount>60)&&(amount<=102)) {
            System.out.println("В вагоне есть стоячие места");
        }else{
            System.out.println("В вагоне нет мест");
        }
    }
    {
        int one=2;
        int two=3;
        int three=4;

        if ((one > two)&& (one > three)){
            System.out.println("Самое большое число -"+ one);
        } else if (one < two && (two>= three)) {
            System.out.println("Cамое большое число -" +two);
        } else {
            System.out.println("Самое большое число -" + three);
        }
    }
    }