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

        int count = 0;
        for(int i = 0; i < (n - 1); i++) {
            for(int j = (i + 1); j < n; j++) {
                if((arr[i] + arr[j]) <= x) {
                    count++;
                }
                else {
                    break;
                }
            }
        }

        if(count == 0) {
            count = n;
        }

        System.out.println(count);
    }
}
