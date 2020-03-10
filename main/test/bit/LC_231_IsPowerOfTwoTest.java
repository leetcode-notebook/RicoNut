package bit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * @author alis
 * @date 2019/12/1 10:39 AM
 * @description
 */
public class LC_231_IsPowerOfTwoTest {
    LC_231_IsPowerOfTwo ipt = new LC_231_IsPowerOfTwo();

    @Test
    public void TestIsPowerOfTwo() {
        assertTrue(ipt.isPowerOfTwo(1));
        assertTrue(ipt.isPowerOfTwo(16));
        assertTrue(!ipt.isPowerOfTwo(218));
    }
}
