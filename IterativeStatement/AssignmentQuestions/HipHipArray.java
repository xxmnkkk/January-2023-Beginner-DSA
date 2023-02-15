package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class HipHipArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        //logic
        int sum = 0;
        long product = 1L;
        if(N % 2 == 0) {
            for(int i = 0; i < N; i++) {
                if(i % 2 == 0) {
                    sum = sum + arr[i];
                }
                else {
                    product = product * arr[i];
                }
            }
        }
        else {
            for(int i = 0; i < N; i++) {
                if(i % 2 == 0) {
                    product = product * arr[i];
                }
                else {
                    sum = sum + arr[i];
                }
            }
        }

        System.out.println(sum + " " + product);
    }
}
