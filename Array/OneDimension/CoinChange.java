package Array.OneDimension;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int coinTable[] = new int[amount + 1];

        for(int i = 1; i <= amount; i++) {
            int minimum = Integer.MAX_VALUE;

            for(int j = 0; j < coins.length; j++) {
                if(coins[j] <= i) {
                    int balanceAmount = i - coins[j];
                    int balanceAmountCoinCount = coinTable[balanceAmount];

                    if(balanceAmountCoinCount != -1) {
                        if(balanceAmountCoinCount < minimum) {
                            minimum = balanceAmountCoinCount;
                        }
                    }
                }
            }

            if(minimum != Integer.MAX_VALUE) {
                coinTable[i] = minimum + 1;
            }
            else {
                coinTable[i] = -1;
            }
        }

        return coinTable[amount];
    }
}
