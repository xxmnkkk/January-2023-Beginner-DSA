package Array.OneDimension.AssignmentQuestions;

import java.util.Scanner;

public class DivisibleByEight {
    private static boolean isDivisibleBy8(int n, int numberOfDigits) {
        if(numberOfDigits == 1) {
            /*
            if(n % 8 == 0) {
                return true;
            }
            return false;
             */
            return (n % 8 == 0);
        }
        else if(numberOfDigits == 2) {
            if(n % 8 == 0) {
                return true;
            }

            int onesDigit = n % 10;
            int tensDigit = n / 10;
            int reverseOfN = onesDigit * 10 + tensDigit;

            /*
            if(reverseOfN % 8 == 0) {
                return true;
            }

            return false;
             */

            return (reverseOfN % 8 == 0);
        }
        else {
            int frequency[] = new int[10];
            int tempN = n;

            while(tempN != 0) {
                int lastDigit = tempN % 10;
                frequency[lastDigit] = frequency[lastDigit] + 1;
                tempN = tempN / 10;
            }

            for(int i = 104; i < 1000; i += 8) {
                int tempI = i;
                int iFreq[] = new int[10];

                while(tempI != 0) {
                    int digit = tempI % 10;
                    iFreq[digit] = iFreq[digit] + 1;
                    tempI = tempI / 10;
                }

                tempI = i;
                int digit = tempI % 10;
                if(iFreq[digit] > frequency[digit]) {
                    continue;
                }
                tempI = tempI / 10;

                digit = tempI % 10;
                if(iFreq[digit] > frequency[digit]) {
                    continue;
                }
                tempI = tempI / 10;

                digit = tempI % 10;
                if(iFreq[digit] > frequency[digit]) {
                    continue;
                }

                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = scanner.nextInt();

            String nStr = String.valueOf(n);
            int numberOfDigits = nStr.length();

            boolean result = isDivisibleBy8(n, numberOfDigits);

            if(result) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
