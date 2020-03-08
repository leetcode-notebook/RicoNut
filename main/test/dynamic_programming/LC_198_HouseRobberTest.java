package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/8 4:41 PM
 */
public class LC_198_HouseRobberTest {
    @Test
    public void house_robby_test() {
        LC_198_HouseRobber houseRobber = new LC_198_HouseRobber();
        assertThat(houseRobber.rob(new int[]{1, 2, 3, 1}), is(4));
    }
}
