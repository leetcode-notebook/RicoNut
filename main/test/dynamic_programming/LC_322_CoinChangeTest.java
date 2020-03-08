package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/8 8:41 AM
 */
public class LC_322_CoinChangeTest {
    @Test
    public void change_coin_by_min_num_test(){
        LC_322_CoinChange cc  = new LC_322_CoinChange();
        assertThat(cc.coinChange(new int[]{186,419,83,408}, 6249), is(20));
    }
}
