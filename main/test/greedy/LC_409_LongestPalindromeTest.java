package greedy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/19 11:31 PM
 */
public class LC_409_LongestPalindromeTest {
    @Test
    public void test_longest_palindrome() {
        LC_409_LongestPalindrome lp = new LC_409_LongestPalindrome();
        assertThat(lp.longestPalindrome("abccccdd"), is(7));
    }
}
