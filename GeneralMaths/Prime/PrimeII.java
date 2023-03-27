package GeneralMaths.Prime;

public class PrimeII {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        for(int i = 2; i < n; i++) {
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
