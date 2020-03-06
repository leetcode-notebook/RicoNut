package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 10:27 AM
 */
public class LCI_57_II_FindContinuousSequenceVIaSum {
    public int[][] findContinuousSequence(int target) {
        if (target <= 2) return null;
        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < target; ++i) {
            int sum = 0;
            int j = i;
            while (sum < target) {
                sum += j++;
            }
            if (sum == target) {
                int[] arr = new int[j - i];
                for (int k = i; k < j; ++k) {
                    arr[k - i] = k;
                }
                result.add(arr);
            }
        }
        return result.toArray(new int[0][]);
    }

    public int[][] findContinuousSequence_double_point(int target) {
        if (target <= 2) return new int[0][];
        List<int[]> result = new ArrayList<>();
        for (int l = 1, r = 2; l < r; ) {
            int sum = (l + r) * (r - l + 1) / 2;
            if (sum == target) {
                int[] arr = new int[r - l + 1];
                for (int i = l; i <= r; ++i) {
                    arr[i - l] = i;
                }
                result.add(arr);
                l++;
            } else if (sum < target) {
                r++;
            } else {
                l++;
            }
        }
        return result.toArray(new int[0][]);
    }
}
