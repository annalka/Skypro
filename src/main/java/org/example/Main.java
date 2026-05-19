package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        {
            int[] arr = new int[]{1, 2, 3};
            double[] arr1 = new double[]{1.57d, 7.654d, 9.986d};
            int[] arr2 = new int[]{7, 9, 0, 4, 5};

            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));

            for (int i = arr.length - 1; i >= 0; i--) {
                if (i > 0) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.println(arr[i]);
                }
            }

            for (int i = arr1.length - 1; i >= 0; i--) {
                if (i > 0) {
                    System.out.print(arr1[i] + ", ");
                } else {
                    System.out.println(arr1[i]);
                }
            }

            for (int i = arr2.length - 1; i >= 0; i--) {
                if (i > 0) {
                    System.out.print(arr2[i] + ", ");
                } else {
                    System.out.println(arr2[i]);
                }
            }


            int i=0;

            for (i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i] = arr[i] + 1;
                }
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
