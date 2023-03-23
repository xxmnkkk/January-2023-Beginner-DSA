package Sorting.AssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class GetTheShadowUsingSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            Arrays.sort(arr);

            int repeatedNumber = 0;
            for(int j = 1; j < n; j++) {
                int difference = arr[j] - arr[j - 1];

                if(difference == 0) {
                    repeatedNumber = arr[j];
                }
            }

            int missingNumber = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j] != (j + 1)) {
                    missingNumber = j + 1;
                }
            }

            System.out.println(repeatedNumber + " " + missingNumber);
        }
    }
}
