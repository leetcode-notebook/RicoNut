package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/3 5:39 PM
 */
public class LCI_10_01_MergeSortArrayTest {
    @Test
    public void mergeSortArrayTest_case_1() {
        LCI_10_01_MergeSortArray mergeSortArray = new LCI_10_01_MergeSortArray();
        int[] a = new int[]{1, 2, 3, 0, 0, 0};
        int[] b = new int[]{2, 5, 6};
        int[] excepted = new int[]{1, 2, 2, 3, 5, 6};
        mergeSortArray.merge(a, 3, b, 3);
        assertThat(a, is(excepted));

    }
    @Test
    public void mergeSortArrayTest_case_2() {
        LCI_10_01_MergeSortArray mergeSortArray = new LCI_10_01_MergeSortArray();
        int[] a = new int[]{4, 5, 6, 0, 0, 0};
        int[] b = new int[]{1, 2, 3};
        int[] excepted = new int[]{1, 2, 3, 4, 5, 6};
        mergeSortArray.merge(a, 3, b, 3);
        assertThat(a, is(excepted));

    }

//    @Test
//    public void mergeSortArrayTest_case_2_double_point() {
//        LCI_10_01_MergeSortArray mergeSortArray = new LCI_10_01_MergeSortArray();
//        int[] a = new int[]{4, 5, 6, 0, 0, 0};
//        int[] b = new int[]{1, 2, 3};
//        int[] excepted = new int[]{1, 2, 3, 4, 5, 6};
//        mergeSortArray.mergeDoublePoint(a, 3, b, 3);
//        assertThat(a, is(excepted));
//
//    }
}
