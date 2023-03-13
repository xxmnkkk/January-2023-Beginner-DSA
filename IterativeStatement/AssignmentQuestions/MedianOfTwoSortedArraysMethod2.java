package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class MedianOfTwoSortedArraysMethod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int j = 0; j < m; j++) {
            arr2[j] = scanner.nextInt();
        }

        int mergedArrayLength = n + m;
        int merged[] = new int[mergedArrayLength];

        int i = 0, j = 0, k = 0;

        while(i < n && j < m) {
            if(arr1[i] < arr2[j]) {
                merged[k] = arr1[i];

                i++;
                k++;
            }
            else if(arr2[j] < arr1[i]) {
                merged[k] = arr2[j];

                j++;
                k++;
            }
            else {
                merged[k] = arr1[i];
                k++;
                merged[k] = arr2[j];
                k++;

                i++;
                j++;
            }
         }

        while(i < n) {
            merged[k] = arr1[i];

            i++;
            k++;
        }

        while(j < m) {
            merged[k] = arr2[j];

            j++;
            k++;
        }

        boolean isEven = (mergedArrayLength % 2 == 0);

        float median;
        if(isEven) {
            median = (merged[mergedArrayLength / 2 - 1] + merged[mergedArrayLength / 2]) / 2.0f;
        }
        else {
            median = merged[mergedArrayLength / 2];
        }

        System.out.printf("%.2f", median);
    }
}
