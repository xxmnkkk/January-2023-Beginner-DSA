package IterativeStatement.AssignmentQuestions;

/*
Contributed by: Sk Hasibul Hossain
 */

import java.util.Scanner;

public class ArrayRotationSolution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[(N - D + i) % N] = scanner.nextInt();
        }

        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
