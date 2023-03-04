package Recursion.AssignmentQuestions;

public class Palindrome {
    static boolean check_Palindrome(String str,int s, int e) {
        if(s >= e) {
            return true;
        }

        if(str.charAt(s) != str.charAt(e)) {
            return false;
        }

        boolean result = check_Palindrome(str, s + 1, e - 1);
        return result;
    }

    public static void main(String[] args) {
        String str = "abccba1";
        boolean result = check_Palindrome(str, 0, str.length() - 1);
        System.out.println(result);
    }
}
