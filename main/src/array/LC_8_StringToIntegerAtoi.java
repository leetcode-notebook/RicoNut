package array;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/4/3 6:58 AM
 */
public class LC_8_StringToIntegerAtoi {
    public int myAtoi(String str) {
        if (null == str || str.length() == 0) return 0;
        char[] array = str.toCharArray();
        int res = 0;
        int curIndex = 0;
        int flag = 1;
        while (array[curIndex] == ' ') {
            curIndex++;
            if (curIndex >= str.length()) return 0;
        }
        if (array[curIndex] == '-') flag = -1;
        if (array[curIndex] == '+' || array[curIndex] == '-') curIndex++;
        while (curIndex < str.length() && Character.isDigit(array[curIndex])) {
            int r = array[curIndex] - '0';
            if (res > (Integer.MAX_VALUE - r) / 10 || res < Integer.MIN_VALUE / 10) {
                return flag > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + r;
            curIndex++;
        }
        return flag > 0 ? res : res * flag;
    }
}
