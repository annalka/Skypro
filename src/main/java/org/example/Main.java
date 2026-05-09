package org.example;

import java.util.Arrays;

public class Main {

    {
      int [] arr = new int[]{1,2,3};
      double [] arr1 = new double[]{1.57d, 7.654d, 9.986d};
      int [] arr2 = new int []{7,9,0,4,5};

      System.out.println(arr[0] +"," + arr[1] +","+ arr[2]);
      System.out.println(arr1[0] + ","+ arr1[1] +","+ arr1[2]);
      System.out.println(arr2[0] +"," + arr2[1] +"," + arr2[2] +","+ arr2[3] +","+ arr2[4]);

      System.out.println(arr[2] +"," + arr[1] +","+ arr[0]);
      System.out.println(arr1[2] + ","+ arr1[1] +","+ arr1[0]);
      System.out.println(arr2[4] +"," + arr2[3] +"," + arr2[2] +","+ arr2[1] +","+ arr2[0]);

      int i=0;

      for (i = 0, i < arr.length, i++) {
        if (arr[i] % 2 != 0) {
            arr[i] = arr[i] + 1;
        }
      }

      System.out.println(Arrays.toString(arr));

    }

   }