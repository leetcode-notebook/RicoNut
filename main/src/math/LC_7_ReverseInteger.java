package math;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/8 10:37 PM
 */
public class LC_7_ReverseInteger {
    /**
     * 思路：利用 取余数的方式取最后一个个位，取出的个位参与结果组装
     */
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
