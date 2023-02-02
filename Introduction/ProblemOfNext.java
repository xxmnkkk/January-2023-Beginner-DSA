package Introduction;

import java.util.Scanner;

public class ProblemOfNext {
    public static void main(String[] args) {
        int i;
        String str1;
        String str2;

        Scanner scanner = new Scanner(System.in);

        i = scanner.nextInt();
        str1 = scanner.next();
        scanner.nextLine();
        str2 = scanner.nextLine();

        System.out.println("i: " + i);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
