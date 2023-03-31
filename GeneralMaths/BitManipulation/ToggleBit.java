package GeneralMaths.BitManipulation;

public class ToggleBit {
    private static String decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    public static void main(String[] args) {
        int n = 98;
        int k = 4;

        String nBinary = decimalToBinary(n);
        int step1 = 1 << k;
        int step2 = step1 ^ n;
        String step2Binary = decimalToBinary(step2);

        System.out.println("Initial value: " + n);
        System.out.println("Binary: " + nBinary);
        System.out.println("Value after toggling: " + k + "-th bit: " + step2);
        System.out.println("Binary: " + step2Binary);
    }
}
