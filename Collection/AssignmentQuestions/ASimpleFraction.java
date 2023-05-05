package Collection.AssignmentQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ASimpleFraction {
    private static String convertToDecimal(int numerator, int denominator) {
        boolean isNegative = (numerator < 0 && denominator > 0) ||
                (denominator < 0 && numerator > 0);

        Map<Integer, Integer> map = new HashMap<>();

        StringBuilder result = new StringBuilder();
        int quotient = numerator / denominator;

        result.append(quotient);

        numerator = numerator % denominator;

        if(numerator != 0) {
            result.append(".");
        }

        int quotientIndex = 0;
        while(numerator != 0) {
            numerator = numerator * 10;
            quotient = numerator / denominator;

            if(!map.containsKey(numerator)) {
                result.append(quotient);
                map.put(numerator, quotientIndex);
                quotientIndex++;

                numerator = numerator % denominator;
            }
            else {
                int openBracketIndex = map.get(numerator) + result.indexOf(".") + 1;
                result.insert(openBracketIndex, "(");
                result.append(")");
                break;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();

            String result = convertToDecimal(numerator, denominator);
            System.out.println(result);
        }
    }
}
