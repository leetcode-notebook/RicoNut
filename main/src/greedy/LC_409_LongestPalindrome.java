package greedy;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/19 11:32 PM
 */
public class LC_409_LongestPalindrome {
    public int longestPalindrome(String s) {
        if (null == s) return 0;
        int[] chars = new int[128];
        for (char c : s.toCharArray()) {
            chars[c]++;
        }
        int res = 0;
        for (int c : chars) {
            res += c / 2 * 2;
            if (res % 2 == 0 && c % 2 == 1) res++;
        }
        return res;
    }
}
