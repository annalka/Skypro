package org.example;

import java.util.Arrays;

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

            float average = sum / inputArray1.length;

            float[] outputArray1 = {sum, max, min, average};

            System.out.print("inputArray1: " + Arrays.toString(inputArray1));
            System.out.print("outputArray1: " + Arrays.toString(outputArray1));
        }

        {
            int[] inputArray2 = {45000, 60000, 38000, 52000, 48000};

            double[] outputArray2 = new double[inputArray2.length];
            double taxRate = 0.13;

            int index = 0;
            for (int salary : inputArray2) {
                outputArray2[index] = salary * taxRate;
                index++;
            }

            System.out.print("inputArray2: " + Arrays.toString(inputArray2));
            System.out.print("outputArray2: " + Arrays.toString(outputArray2));
        }
        {
            int[] inputArray3 = {3500, 6200, 4800, 7500, 5100};

            boolean[] outputArray3 = new boolean[inputArray3.length];

            int index = 0;
            for (int bonus : inputArray3) {
                outputArray3[index] = bonus > 5000;
                index++;
            }
            System.out.print("inputArray3: " + Arrays.toString(inputArray3));
            System.out.print("outputArray3: " + Arrays.toString(outputArray3));
        }

        {
            int[] inputArray4 = {15000, 22000, -500, 18000, 25000};

            boolean[] outputArray4 = new boolean[1];
            outputArray4[0] = true;

            for (int balance : inputArray4) {
                if (balance < 0) {
                    outputArray4[0] = false;
                    break;
                }
            }

            System.out.print("inputArray4: " + Arrays.toString(inputArray4));
            System.out.print("outputArray4: " + Arrays.toString(outputArray4));
        }
        {
            int[] inputArray5 = {120000, -15000, 85000, 0, 210000};
            int[] outputArray5 = new int[1];
            outputArray5[0] = 0;

            for (int profit : inputArray5) {
                if (profit > 0) {
                    outputArray5[0]++;
                }
            }
            System.out.println("inputArray5: " + Arrays.toString(inputArray5));
            System.out.println("outputArray5: " + Arrays.toString(outputArray5));
        }
    }
}