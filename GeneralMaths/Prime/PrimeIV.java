package GeneralMaths.Prime;

public class PrimeIV {
    private static boolean isPrime(int n) {
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 33;

        if(isPrime(n)) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
