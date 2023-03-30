package GeneralMaths.AssignmentQuestions;

public class FirstTwo {
    static int firstTwo(int N) {
        int firstTwo;
        firstTwo = (N >= 111 && N <= 999) ? (N / 10) : (N / 100);

        int unitDigitOfFirstTwo = firstTwo % 10;
        int tensDigitOfFirstTwo = firstTwo / 10;
        int answer = unitDigitOfFirstTwo * 10 + tensDigitOfFirstTwo;

        return answer;
    }

    public static void main(String[] args) {
        int n = 192;

        int answer = firstTwo(n);
        System.out.println(answer);
    }
}
