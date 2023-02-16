package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class ArrayRotationSolution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();

        int input[] = new int[N];

        for(int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }

        int output[] = new int[N];
        for(int i = 0; i < D; i++) {
            output[N - D + i] = input[i];
        }
        for(int i = D; i < N; i++) {
            output[i - D] = input[i];
        }

        for(int i = 0; i < N; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
