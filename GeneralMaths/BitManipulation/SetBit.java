package GeneralMaths.BitManipulation;

public class SetBit {
    private static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }
    private static String decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    public static void main(String[] args) {
        int n = 98;
        int k = 2;

        String nBinary = decimalToBinary(n);
        int step1 = 1 << k;
        int step2 = n | step1;
        String step2Binary = decimalToBinary(step2);

        System.out.println("Initial value: " + n);
        System.out.println("Binary: " + nBinary);
        System.out.println("Value after setting: " + k + "-th bit: " + step2);
        System.out.println("Binary: " + step2Binary);
    }
}
