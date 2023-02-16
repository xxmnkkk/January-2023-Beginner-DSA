package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class ArrayRotationSolution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < D; i++) {
            int temp = arr[0];

            for(int j = 1; j < N; j++) {
                arr[j - 1] = arr[j];
            }

            arr[N - 1] = temp;
        }

        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
