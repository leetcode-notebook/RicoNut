package math;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/18 3:16 PM
 */
public class LC_836_RectangleOverlap {
    /**
     * 思路：rec1左下角的坐标都比rec2右上角大，rec1右上角的坐标都比rec2左下角大，
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[2] > rec2[0] &&   // left
                rec1[3] > rec2[1] &&   // bottom
                rec1[0] < rec2[2] &&   // right
                rec1[1] < rec2[3];    // top
    }
}
