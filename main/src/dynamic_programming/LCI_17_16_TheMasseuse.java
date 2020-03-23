package dynamic_programming;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/24 6:17 AM
 */
public class LCI_17_16_TheMasseuse {
    /**
     * DP解法
     * 1. 找出重复子问题: 是否接收当前预约，根据接客总时长判断
     * 2. dp容器: dp[] 用来存储当前客人是否应该预约的总时长
     * 3. 状态转移方超: dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]+0);
     */
    public int massage(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

    public int massage_O1(int[] nums) {
        int a = 0, b = 0;
        for (int num : nums) {
            int c = Math.max(a + num, b);
            a = b;
            b = c;
        }
        return b;
    }
}
