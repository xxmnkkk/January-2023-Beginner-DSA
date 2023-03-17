package Sorting.AssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        int k = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for(int i = (n - 1); i > (n - 1 - k); i--) {
            if(arr[i] > 0) {
                arr[i] = -arr[i];
            }
        }

        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
