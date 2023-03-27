package GeneralMaths.Prime;

public class AllPrimeNumbersUptoN {
    private static boolean isPrime(int n) {
        int squareRootOfN = (int)Math.sqrt(n);

        for(int i = 2; i <= squareRootOfN; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 191;

        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
