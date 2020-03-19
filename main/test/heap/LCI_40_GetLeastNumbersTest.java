package heap;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/20 6:32 AM
 */
public class LCI_40_GetLeastNumbersTest {
    @Test
    public void test_least_numbers() {
        LCI_40_GetLeastNumbers gn = new LCI_40_GetLeastNumbers();
        assertThat(gn.getLeastNumbers(new int[]{3, 2, 1}, 2), is(new int[]{2, 1}));
    }
}
