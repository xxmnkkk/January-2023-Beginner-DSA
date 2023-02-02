package Introduction;

import java.util.Scanner;

public class NextLineAndNext {
    public static void main(String[] args) {
        String str1;
        String str2;

        Scanner scanner = new Scanner(System.in);

        str1 = scanner.nextLine();
        str2 = scanner.next();

        System.out.println(str1);
        System.out.println(str2);
    }
}
