package String.AssignmentQuestions;

import java.util.Scanner;

public class CountHiInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int index = str.indexOf("hi");
        int count = 0;

        while(index != -1) {
            count++;

            index = str.indexOf("hi", index + 2);
        }

        System.out.println(count);
    }
}
