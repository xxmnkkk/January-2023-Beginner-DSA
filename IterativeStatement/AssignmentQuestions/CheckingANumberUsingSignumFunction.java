package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class CheckingANumberUsingSignumFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int signum = Integer.signum(num);

        switch(signum) {
            case 1:
                System.out.println("Positive");
                break;
            case 0:
                System.out.println("Zero");
                break;
            case -1:
                System.out.println("Negative");
                break;
        }
    }
}
