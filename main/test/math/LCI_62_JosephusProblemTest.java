package math;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/30 6:32 AM
 */
public class LCI_62_JosephusProblemTest {
    @Test
    public void test_last_remaining_5_cut_3() {
        LCI_62_JosephusProblem jp = new LCI_62_JosephusProblem();
        assertThat(jp.lastRemaining(5, 3), is(3));
    }

    @Test
    public void test_last_remaining_10_cut_17() {
        LCI_62_JosephusProblem jp = new LCI_62_JosephusProblem();
        assertThat(jp.lastRemaining(10, 17), is(2));
    }
}
