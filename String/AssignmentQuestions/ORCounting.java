package String.AssignmentQuestions;

import java.util.Scanner;

public class ORCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int length = a.length();

        int count = 1;
        for(int i = 0; i < length; i++) {
            char aCh = a.charAt(i);
            char bCh = b.charAt(i);

            if(aCh == '1' && bCh == '1') {
                count = count * 2;
            }
            else if(aCh == '1' && bCh == '0') {
                count = 0;
                break;
            }
            else {

            }
        }

        System.out.println(count);
    }
}
