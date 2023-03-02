package String.AssignmentQuestions;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String number = scanner.nextLine();

        int sum = 0;
        for(int i = 0; i < n; i++) {
            int digit = number.charAt(i) - '0';
            sum += digit;
        }
        for(int i = n; i < (2 * n); i++) {
            int digit = number.charAt(i) - '0';
            sum -= digit;
        }

        if(sum == 0) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("UNLUCKY");
        }
    }
}
