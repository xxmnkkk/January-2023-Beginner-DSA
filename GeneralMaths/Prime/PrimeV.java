package GeneralMaths.Prime;

public class PrimeV {
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

        if(isPrime(n)) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
