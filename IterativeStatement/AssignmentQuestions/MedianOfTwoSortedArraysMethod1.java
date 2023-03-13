package IterativeStatement.AssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArraysMethod1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for(int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for(int j = 0; j < m; j++) {
            arr2[j] = scanner.nextInt();
        }

        int mergedArrayLength = n + m;
        int merged[] = new int[mergedArrayLength];
        for(int i = 0; i < n; i++) {
            merged[i] = arr1[i];
        }
        for(int j = 0; j < m; j++) {
            merged[n + j] = arr2[j];
        }

        Arrays.sort(merged);

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
