package GeneralMaths.BitManipulation.AssignmentQuestion;

import java.util.Scanner;

public class GrayCode {
    private static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }
    private static String decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }
    private static int findGrayCode(int num) {
        String numBinary = decimalToBinary(num);
        int numBinaryLength = numBinary.length();
        char grayCodeChar[] = new char[numBinaryLength];

        grayCodeChar[0] = numBinary.charAt(0);
        for(int i = 1; i < numBinaryLength; i++) {
            int ch1 = numBinary.charAt(i) - '0';
            int ch2 = numBinary.charAt(i - 1) - '0';
            int xor = ch1 ^ ch2;

            grayCodeChar[i] = (char)(xor + '0');
        }

        String grayCodeStr = new String(grayCodeChar);
        int grayCode = binaryToDecimal(grayCodeStr);

        return grayCode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i = 1; i <= t; i++) {
            int num = scanner.nextInt();
            int grayCode = findGrayCode(num);
            System.out.println(grayCode);
        }
    }
}
