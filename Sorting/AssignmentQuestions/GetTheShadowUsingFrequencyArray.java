package Sorting.AssignmentQuestions;

import java.util.Scanner;

public class GetTheShadowUsingFrequencyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int frequency[] = new int[n + 1];
            for(int j = 0; j < n; j++) {
                int number = arr[j];
                frequency[number] = frequency[number] + 1;
            }

            for(int j = 1; j <= n; j++) {
                if(frequency[j] > 1) {
                    System.out.print(j + " ");
                }
            }

            for(int j = 1; j <= n; j++) {
                if(frequency[j] == 0) {
                    System.out.println(j + " ");
                    break;
                }
            }
        }
    }
}
