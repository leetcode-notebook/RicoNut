package math;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/30 6:33 AM
 */
public class LCI_62_JosephusProblem {
    /**
     * recur: f(n,m) = f(n-1,m)
     */
    public int lastRemaining(int n, int m) {
        // terminator
        if (n == 1) return 0;
        int x = lastRemaining(n - 1, m);
        return (m + x) % n;
    }
}
