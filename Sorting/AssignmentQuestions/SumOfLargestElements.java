package Sorting.AssignmentQuestions;

import java.util.Scanner;

public class SumOfLargestElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 1; i <= 4; i++) {
            for(int j = 0; j < (n - i); j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int answer = arr[n - 1] + arr[n - 2] + arr[n - 3] + arr[n - 4];

        System.out.println(answer);
    }
}
