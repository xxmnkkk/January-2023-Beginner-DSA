package GeneralMaths.AssignmentQuestions;

import java.util.Scanner;

public class MakeMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i = 1; i <= t; i++) {
            int a  = scanner.nextInt();
            int b = scanner.nextInt();

            int d = b - a;

            if(d < a) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
