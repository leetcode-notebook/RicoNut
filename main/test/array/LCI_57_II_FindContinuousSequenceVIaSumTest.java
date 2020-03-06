package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 10:25 AM
 */
public class LCI_57_II_FindContinuousSequenceVIaSumTest {
    @Test
    public void findContinuousSequence() {
        LCI_57_II_FindContinuousSequenceVIaSum findContinuousSequenceVIaSum = new LCI_57_II_FindContinuousSequenceVIaSum();
        int[][] result = findContinuousSequenceVIaSum.findContinuousSequence(9);
        assertThat(result, is(new int[][]{{2, 3, 4}, {4, 5}}));

    }

    @Test
    public void findContinuousSequence_double_point() {
        LCI_57_II_FindContinuousSequenceVIaSum findContinuousSequenceVIaSum = new LCI_57_II_FindContinuousSequenceVIaSum();
        int[][] result = findContinuousSequenceVIaSum.findContinuousSequence_double_point(9);
        assertThat(result, is(new int[][]{{2, 3, 4}, {4, 5}}));

    }

}
