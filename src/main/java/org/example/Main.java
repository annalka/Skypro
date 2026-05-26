package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            String firstName = "Ivan ";
            String middleName = "Ivanovich ";
            String lastName = "Ivanov";
            String fullName = firstName + middleName + lastName;

            System.out.println("Ф. И. О. сотрудника —" + fullName);

            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —" + fullName.toUpperCase());

        }
        {
            String fullName = "Иванов Семён Семёнович";
            String fullNameNew = fullName.replace("ё", "е");
            System.out.println(fullNameNew);
        }
    }
}