package GeneralMaths.BitManipulation;

public class UnsetBit {
    private static String decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    public static void main(String[] args) {
        int n = 98;
        int k = 5;

        String nBinary = decimalToBinary(n);
        int step1 = 1 << k;
        int step2 = ~step1;
        int step3 = n & step2;
        String step3Binary = decimalToBinary(step3);

        System.out.println("Initial value: " + n);
        System.out.println("Binary: " + nBinary);
        System.out.println("Value after unsetting: " + k + "-th bit: " + step3);
        System.out.println("Binary: " + step3Binary);
    }
}
