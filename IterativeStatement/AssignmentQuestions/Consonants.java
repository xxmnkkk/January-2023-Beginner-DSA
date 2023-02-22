package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int inputLength = input.length();

        for(int i = 0; i < inputLength; i++) {
            char ch = input.charAt(i);

            if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                System.out.print(ch);
            }
        }
    }
}
