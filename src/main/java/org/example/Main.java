package org.example;

public class Main {
    public static void main(String[] args) {
        {
            int[] inputArray1 = {15000, 23000, 8500, 19000, 12000};

            int sum = 0;
            int max = inputArray1[0];
            int min = inputArray1[0];

            for (int payment : inputArray1) {
                sum += payment;

                if (payment > max) {
                    max = payment;
                }

                if (payment < min) {
                    min = payment;
                }
            }

            int average = sum / inputArray1.length;

            int[] outputArray1 = {sum, max, min, average};

            System.out.print("inputArray1: [");
            for (int i = 0; i < inputArray1.length; i++) {
                System.out.print(inputArray1[i]);
                if (i < inputArray1.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.print("outputArray1: [");
            for (int i = 0; i < outputArray1.length; i++) {
                System.out.print(outputArray1[i]);
                if (i < outputArray1.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        {
            int[] inputArray2 = {45000, 60000, 38000, 52000, 48000};

            double[] outputArray2 = new double[inputArray2.length];
            double taxRate = 0.13;

            for (int i = 0; i < inputArray2.length; i++) {
                outputArray2[i] = inputArray2[i] * taxRate;
            }

            System.out.print("inputArray2: [");
            for (int i = 0; i < inputArray2.length; i++) {
                System.out.print(inputArray2[i]);
                if (i < inputArray2.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.print("outputArray2 (налог 13%): [");
            for (int i = 0; i < outputArray2.length; i++) {
                System.out.printf("%.2f", outputArray2[i]);
                if (i < outputArray2.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        {
            int[] inputArray4 = {15000, 22000, -500, 18000, 25000};

            boolean outputArray4 = true;

            for (int balance : inputArray4) {
                if (balance < 0) {
                    outputArray4 = false;
                    break;
                }

                System.out.print("inputArray4 (остатки на счёте по месяцам): [");
                for (int i = 0; i < inputArray4.length; i++) {
                    System.out.print(inputArray4[i]);
                    if (i < inputArray4.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
                System.out.println("outputArray4 (нет просрочек?): " + outputArray4);
            }
        }

        {
            int[] inputArray5 = {120000, -15000, 85000, 0, 210000};

            int outputArray5 = 0;

            for (int profit : inputArray5) {
                if (profit > 0) {
                    outputArray5++;
                }
            }

            System.out.print("inputArray5 (чистая прибыль по месяцам): [");
            for (int i = 0; i < inputArray5.length; i++) {
                System.out.print(inputArray5[i]);
                if (i < inputArray5.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.println("outputArray5 (количество рентабельных месяцев): " + outputArray5);
        }
    }
}
