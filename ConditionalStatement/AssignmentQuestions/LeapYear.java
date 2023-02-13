package ConditionalStatement.AssignmentQuestions;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        String result;

        //century year
        if(year % 100 == 0) {
            if(year % 400 == 0) {
                result = "True";
            }
            else {
                result = "False";
            }
        }
        //non-century year
        else {
            if(year % 4 == 0) {
                result = "True";
            }
            else {
                result = "False";
            }
        }

        System.out.println(result);
    }
}
