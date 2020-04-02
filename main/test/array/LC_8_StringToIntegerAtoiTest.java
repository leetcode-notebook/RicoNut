package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/4/3 6:56 AM
 */
public class LC_8_StringToIntegerAtoiTest {
    @Test
    public void test_string_to_integer_atomic() {
        LC_8_StringToIntegerAtoi at = new LC_8_StringToIntegerAtoi();
        assertThat(at.myAtoi("   -42"), is(-42));
        assertThat(at.myAtoi("4193 with words"), is(4193));
        assertThat(at.myAtoi("words and 987"), is(0));
        assertThat(at.myAtoi("  "), is(0));
        assertThat(at.myAtoi("2147483648"), is(2147483647));
    }
}
