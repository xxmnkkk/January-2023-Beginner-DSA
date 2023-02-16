package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class GameOfPiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for(int i = 1; i <= T; i++) {
            int N = scanner.nextInt();
            int arr[] = new int[N];

            boolean containsOne = false;
            long totalNumberOfStones = 0L;
            for(int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();

                if(arr[j] == 1) {
                    containsOne = true;
                    break;
                }

                totalNumberOfStones = totalNumberOfStones + arr[j];
            }

            if(containsOne) {
                System.out.println("CHEF");
            }
            else {
                if(totalNumberOfStones % 2 == 1) {
                    System.out.println("CHEF");
                }
                else {
                    System.out.println("CHEFINA");
                }
            }
        }
    }
}
