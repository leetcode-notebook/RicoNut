package dynamic_programming;

import java.util.Arrays;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/8 8:43 AM
 */
public class LC_322_CoinChange {
    /**
     * 重复子问题：
     * dp存储空间
     * dp方程:
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int max = amount + 1;
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; ++i) {
            for (int coin : coins) {
                if (i < coin) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }
}
