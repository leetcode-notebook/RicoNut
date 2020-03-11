package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/11 1:20 PM
 */
public class LC_1013_PartitionArrayIntoThreePartsWithEqualSumTest {
    @Test
    public void test_partition_array_into_three_parts_with_equal_sum() {
        LC_1013_PartitionArrayIntoThreePartsWithEqualSum ps = new LC_1013_PartitionArrayIntoThreePartsWithEqualSum();
        assertThat(ps.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}), is(true));
        assertThat(ps.canThreePartsEqualSum(new int[]{1, -1, 1, -1}), is(false));
    }
}
