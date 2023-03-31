package GeneralMaths.BitManipulation.Questions;

public class CheckIfBitsAreInAlternatePattern {
    private static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    public static void main(String[] args) {
        String binary = "101010101011111";
        int n = binaryToDecimal(binary);

        int step1 = n >> 1;
        int step2 = n ^ step1;
        int step3 = step2 & (step2 + 1);

        String result = (step3 == 0) ? "Yes" : "No";

        System.out.println(result);
    }
}
