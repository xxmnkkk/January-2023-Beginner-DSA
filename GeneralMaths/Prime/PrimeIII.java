package GeneralMaths.Prime;

public class PrimeIII {
    public static void main(String[] args) {
        int n = 4;
        int count = 0;

        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        if(count == 0) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
