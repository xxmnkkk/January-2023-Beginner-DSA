package Sorting.AssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleNumbersII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int i = 0, j = n - 1;
        int count = 0;
        while(i <= j) {
            if((arr[i] + arr[j]) <= x) {
                count++;

                i++;
                j--;
            }
            else {
                count++;

                j--;
            }
        }

        System.out.println(count);
    }
}
