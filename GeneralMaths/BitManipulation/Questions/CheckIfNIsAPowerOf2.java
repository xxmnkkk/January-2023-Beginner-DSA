package GeneralMaths.BitManipulation.Questions;

public class CheckIfNIsAPowerOf2 {
    public static void main(String[] args) {
        int n = 1024;
        int result = n & (n - 1);
        String answer = (result == 0) ? "Yes" : "No";

        System.out.println(answer);
    }
}
