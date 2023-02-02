package Introduction;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        String str1;
        String str2;

        Scanner scanner = new Scanner(System.in);

        str1 = scanner.nextLine();
        str2 = scanner.nextLine();

        System.out.println(str1);
        System.out.println(str2);
    }
}
