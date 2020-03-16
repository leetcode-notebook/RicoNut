package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/16 12:30 PM
 */
public class LCI_0106_CompressStringTest {
    @Test
    public void test_compress_string() {
        LCI_0106_CompressString cs = new LCI_0106_CompressString();
        assertThat(cs.compressString("aabcccccaaa"), is("a2b1c5a3"));
    }

    @Test
    public void test_compress_string_case2() {
        LCI_0106_CompressString cs = new LCI_0106_CompressString();
        assertThat(cs.compressString("abbccd"), is("abbccd"));
    }

    @Test
    public void test_compress_string_case3() {
        LCI_0106_CompressString cs = new LCI_0106_CompressString();
        assertThat(
                cs.compressString("rrrrrLLLLLPPPPPPRRRRRgggNNNNNVVVVVVVVVVDDDDDDDDDDIIIIIIIIIIlllllllAAAAqqqqqqqbbbNNNNffffff"),
                is("r5L5P6R5g3N5V10D10I10l7A4q7b3N4f6"));
    }

    @Test
    public void test_compress_string_case4() {
        LCI_0106_CompressString cs = new LCI_0106_CompressString();
        assertThat(cs.compressString("a"), is("a"));
    }

    @Test
    public void test_compress_string_case5() {
        LCI_0106_CompressString cs = new LCI_0106_CompressString();
        assertThat(cs.compressString("aa"), is("aa"));
    }
}
