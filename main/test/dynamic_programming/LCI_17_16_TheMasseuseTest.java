package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/24 6:15 AM
 */
public class LCI_17_16_TheMasseuseTest {
    @Test
    public void test_massage_max_val() {
        LCI_17_16_TheMasseuse mas = new LCI_17_16_TheMasseuse();
        assertThat(mas.massage(new int[]{1, 2, 3, 1}), is(4));
        assertThat(mas.massage(new int[]{2, 7, 9, 3, 1}), is(12));
        assertThat(mas.massage(new int[]{2, 1, 4, 5, 3, 1, 1, 3}), is(12));
    }

    @Test
    public void test_massage_max_val_O1() {
        LCI_17_16_TheMasseuse mas = new LCI_17_16_TheMasseuse();
        assertThat(mas.massage_O1(new int[]{1, 2, 3, 1}), is(4));
        assertThat(mas.massage_O1(new int[]{2, 7, 9, 3, 1}), is(12));
        assertThat(mas.massage_O1(new int[]{2, 1, 4, 5, 3, 1, 1, 3}), is(12));
    }
}
