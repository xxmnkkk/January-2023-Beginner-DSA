package Introduction;

import java.util.Scanner;

public class NextAndNextLine {
    public static void main(String[] args) {
        String str1;
        String str2;

        Scanner scanner = new Scanner(System.in);

        str1 = scanner.next();
        str2 = scanner.nextLine();

        System.out.println(str1);
        System.out.println(str2);
    }
}
