package array;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/11 1:21 PM
 */
public class LC_1013_PartitionArrayIntoThreePartsWithEqualSum {
    public Boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if (sum % 3 != 0) return false;
        int i = 0;
        int n = A.length;
        int targetSum = 0;
        while (i < n) {
            targetSum += A[i++];
            if (targetSum == sum / 3) {
                break;
            }
        }
        if (targetSum != sum / 3) return false;
        while (i + 1 < n) {
            targetSum += A[i++];
            if (targetSum == sum / 3 * 2) {
                return true;
            }
        }
        return false;
    }
}
