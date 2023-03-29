package GeneralMaths.Prime;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;

        boolean prime[] = new boolean[n + 1];
        for(int i = 1; i <= n; i++) {
            prime[i] = true;
        }

        for(int p = 2; p * p <= n; p++) {
            if(prime[p]) {
                for(int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(prime[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
