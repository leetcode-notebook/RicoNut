package array;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/3 5:40 PM
 */
public class LCI_10_01_MergeSortArray {
    /**
     * 思路：将b并入a中，再对a排序
     */
    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = A.length - n; i < A.length; i++) {
            A[i] = B[i - m];
        }
        sort_pop_helper(A, 0, A.length - 1);
    }

    private void sort_pop_helper(int[] nums, int left, int right) {
        int i = left;
        int j = right;
        if (left > right) return;
        int numIndex = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= numIndex) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] <= numIndex) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
            nums[i] = numIndex;
            sort_pop_helper(nums, left, i - 1);
            sort_pop_helper(nums, i + 1, right);
        }
    }

    /**
     * 双指针法：前提是A数组和B数组是有序数组，在A、B数组上分别用一个指针标记，用来每次比较标记位的最小值传给新的有序数组
     */
    public void mergeDoublePoint(int[] A, int m, int[] B, int n) {
        int[] sorted = new int[A.length];
        int cur = 0;
        int a_index = 0, b_index = 0;
        while (a_index < m || b_index < n) {
            if (a_index == m) {
                sorted[cur++] = B[b_index++];
            } else if (b_index == n) {
                sorted[cur++] = A[a_index++];
            } else if (A[a_index] < B[b_index]) {
                sorted[cur++] = A[a_index++];
            } else {
                sorted[cur++] = B[b_index++];
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            A[i] = sorted[i];
        }
    }
}
