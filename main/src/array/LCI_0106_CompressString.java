package array;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/16 12:31 PM
 */
public class LCI_0106_CompressString {
    public String compressString(String S) {
        if (null == S || S.length() == 0) return S;
        char[] sc = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(sc[0]);
        for (int i = 1; i < sc.length; ++i) {
            if (sc[i - 1] == sc[i]) {
                count++;
            } else {
                sb.append(count).append(sc[i]);
                count = 1;
            }
        }
        sb.append(count);
        return sb.length() >= S.length() ? S : sb.toString();
    }
}
