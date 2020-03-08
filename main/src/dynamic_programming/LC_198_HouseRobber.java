package dynamic_programming;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/8 4:42 PM
 */
public class
LC_198_HouseRobber {
    /**
     * DP解法：
     * 一栋房子，小偷是否光顾有两种情况，要么偷，要么不偷。
     * 可以用二维数据的方式
     * dp[偷到当前房子时的金币数量][偷/不偷]， 如果对第一个房子的两种状态，进行递推计算，
     * 对比最后一栋房子的时候，哪种方案的金币多，就用哪种方案
     * Success: Runtime:0 ms, faster than 100.00% of Java online submissions. Memory Usage:37 MB, less than 5.02% of Java online submissions.
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[][] dp = new int[nums.length][2];
        // 第一个房子偷与不偷的方案
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        // 按照隔栋偷的原则，递推下去
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[nums.length - 1][1], dp[nums.length - 1][0]);
    }

    /**
     * 只用以为数据记录每栋房子必偷时的金币数量(必偷，但是不拿金币)，取dp数组中的最大值，就是所得的金币
     * 5:17 PM	info
     * Success:
     * Runtime:0 ms, faster than 100.00% of Java online submissions.
     * Memory Usage:36.6 MB, less than 5.02% of Java online submissions.
     */
    public int rob_pretty(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + 0, dp[i - 2] + nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public int rob_pretty_1_array(int[] nums) {
        int prevMax = 0;
        int currMax = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(prevMax + nums[i], currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
