package GeneralMaths.BitManipulation;

public class CheckIfSetOrUnset {
    private static String decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    public static void main(String[] args) {
        int n = 98;
        int k = 5;

        String nBinary = decimalToBinary(n);
        int step1 = 1 << k;
        int step2 = step1 & n;
        int bit = (step2 > 0) ? 1 : 0;

        System.out.println("Initial value: " + n);
        System.out.println("Binary: " + nBinary);
        System.out.println(k + "-th bit was: " + bit);
    }
}
