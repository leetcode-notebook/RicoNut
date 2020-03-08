package math;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/8 10:36 PM
 */
public class LC_7_ReverseIntegerTest {
    @Test
    public void reverse_integer_test() {
        LC_7_ReverseInteger ri = new LC_7_ReverseInteger();
        assertThat(ri.reverse(123), is(321));
    }
}
