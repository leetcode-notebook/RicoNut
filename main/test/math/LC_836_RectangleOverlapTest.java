package math;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/18 3:15 PM
 */
public class LC_836_RectangleOverlapTest {
    @Test
    public void test_is_over_lap() {
        LC_836_RectangleOverlap rl = new LC_836_RectangleOverlap();
        assertThat(rl.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}), is(true));
    }

    @Test
    public void test_is_over_lap_case2() {
        LC_836_RectangleOverlap rl = new LC_836_RectangleOverlap();
        assertThat(rl.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}), is(false));
    }

    @Test
    public void test_is_over_lap_case3() {
        LC_836_RectangleOverlap rl = new LC_836_RectangleOverlap();
        assertThat(rl.isRectangleOverlap(new int[]{5, 15, 8, 18}, new int[]{0, 3, 7, 9}), is(false));
    }
}
