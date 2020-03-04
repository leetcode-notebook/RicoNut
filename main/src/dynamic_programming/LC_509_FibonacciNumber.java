package dynamic_programming;

/**
 * 斐波那契数列，F(n) = F(n-1) + F(n-2)
 *
 * @author liangqian0723@gmail.com
 * @since 2020/3/4 1:38 PM
 */
public class LC_509_FibonacciNumber {
    /**
     * dp解法(缓存递归)
     */
    public int fib(int n) {
        return fib_memory(n, new int[n + 1]);
    }

    private int fib_memory(int n, int[] memory) {
        if (n <= 1) return n;
        if (memory[n] == 0) {
            memory[n] = fib_memory(n - 1, memory) + fib_memory(n - 2, memory);
        }
        return memory[n];
    }

    /**
     * 自底向上递推：先从给出的例子，得出递推场景，再向上递推
     */
    public int fib_loop(int n) {
        int p1 = 0, p2 = 1, p3 = p1 + p2;
        if (n == 0) return p1;
        if (n == 1) return p2;
        for (int i = 2; i <= n; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }
        return p3;
    }
    /**
     * DP动态数组解法
     * 递推公式：dp[n] = dp[n-1] + dp[n-2]
     * */
    public int fib_dp_array(int n) {
        if (n<=1) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
