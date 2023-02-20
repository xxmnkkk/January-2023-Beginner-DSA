package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class OddEvenPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            int asteriskCount = 2 * i - 1;
            int hashCount = 2 * asteriskCount;

            for(int j = 1; j <= asteriskCount; j++) {
                System.out.print("*");
            }
            System.out.println();

            for(int j = 1; j <= hashCount / 2; j++) {
                System.out.print("##");
            }
            System.out.println();
        }
    }
}
