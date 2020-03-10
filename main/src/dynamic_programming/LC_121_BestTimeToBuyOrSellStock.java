package dynamic_programming;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/9 10:33 AM
 */
public class LC_121_BestTimeToBuyOrSellStock {
    /**
     * 暴力遍历
     */
    public int maxProfit_2d(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }

    public int maxProfit_1d(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price > min) {
                maxProfit = Math.max(maxProfit, price - min);
            } else {
                min = price;
            }
        }
        return maxProfit;
    }
}
