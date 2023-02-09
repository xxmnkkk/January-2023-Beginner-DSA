package IterativeStatement;

public class PalindromeNumber {
    public static void main(String[] args) {
        int original = 3814183;
        int temp = original;

        int reverse = 0;

        while(temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;

            temp = temp / 10;
        }

        String result = (original == reverse) ? "" : "Not ";

        System.out.println(result + "Palindrome");
    }
}
