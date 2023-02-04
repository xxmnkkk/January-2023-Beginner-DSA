package ConditionalStatement.AssignmentQuestions;

import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int dN = Math.abs(C - A);
        int dS = Math.abs(C - B);

        if(dN < dS) {
            System.out.println("N");
        }
        else if(dS < dN) {
            System.out.println("S");
        }
        else {
            System.out.println("D");
        }
    }
}
