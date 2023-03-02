package String.AssignmentQuestions;

import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            String s = scanner.next();
            String firstLetter = s.substring(0, 1).toUpperCase();
            String remainingString = s.substring(1).toLowerCase();

            s = firstLetter + remainingString;

            System.out.println(s);
        }
    }
}
