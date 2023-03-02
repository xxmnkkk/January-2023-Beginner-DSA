package String.AssignmentQuestions;

import java.util.Scanner;

public class CommonDigitsInTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        for(int i = 0; i < str1.length() && i < str2.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                System.out.print(str1.charAt(i) + " ");
            }
        }
    }
}
