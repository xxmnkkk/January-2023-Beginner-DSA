package Recursion.AssignmentQuestions;

import java.util.Scanner;

public class TowerOfHanoi {
    private static void solveTowerOfHanoi(int n, char source, char helper, char destination) {
        if(n == 1) {
            System.out.println("1:" + source + "->" + destination);
            return;
        }

        solveTowerOfHanoi(n - 1, source, destination, helper);
        System.out.println(n + ":" + source + "->" + destination);
        solveTowerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        solveTowerOfHanoi(n, 'A', 'B', 'C');
    }
}
