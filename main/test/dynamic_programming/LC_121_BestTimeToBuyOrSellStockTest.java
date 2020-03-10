package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/9 10:28 AM
 */
public class LC_121_BestTimeToBuyOrSellStockTest {
    @Test
    public void best_time_to_buy_sell_stock_resolve_2D_test() {
        LC_121_BestTimeToBuyOrSellStock bt = new LC_121_BestTimeToBuyOrSellStock();
        assertThat(bt.maxProfit_2d(new int[]{7, 1, 5, 3, 6, 4}), is(5));
    }

    @Test
    public void best_time_to_buy_sell_stock_resolve_1D_test() {
        LC_121_BestTimeToBuyOrSellStock bt = new LC_121_BestTimeToBuyOrSellStock();
        assertThat(bt.maxProfit_1d(new int[]{7, 1, 5, 3, 6, 4}), is(5));
    }
}
