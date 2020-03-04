package array;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/5 6:02 AM
 */
public class LC_1103_DistributeCandiesToPeople {
    /**
     * 思路: 迭代法，自底向上递推
     *
     * @param candies    糖果数
     * @param num_people 待分配的孩子
     * @return {@link int[]} 糖果分配状况
     * @since 2020/3/5 6:02 AM
     */
    public int[] distributeCandies_loop(int candies, int num_people) {
        int[] d_children = new int[num_people];
        if (candies == 0) return d_children;
        int curIndex = 0;
        int lastCandies = 0;
        while (candies > 0) {
            // 上一个孩子最后一次分了几颗糖
            lastCandies = Math.min(lastCandies + 1, candies);
            d_children[curIndex] = d_children[curIndex] + lastCandies;
            candies -= lastCandies;
            // 找准下一个孩子
            if (curIndex < num_people - 1) {
                ++curIndex;
            } else {
                curIndex = 0;
            }
        }
        return d_children;
    }

    /**
     * 数学解法： 先计算每层分完所有孩子，需要多少糖果，；再计算当前糖果可以分配多少层，最后将余数做最后处理
     */
    public int[] distributeCandies_math(int candies, int num_people) {
        int[] candies_distribute = new int[num_people];
        if (num_people == 0) return new int[0];
        int cur_level_candies = (1 + num_people) * num_people / 2;
        int level_num = candies / cur_level_candies;
        int last_level_candies_num = candies % cur_level_candies;
        //  构建第一层到第（level_num -1）层每个孩子的糖果数量
        for (int i = 0; i < num_people && level_num > 0; ++i) {
            candies_distribute[i] = ((i + 1) + (i + 1) * level_num) / 2;
        }
        for (int i = 0; i < num_people; ++i) {
            int cur = Math.min((i + 1) * (level_num + 1), last_level_candies_num);
            candies_distribute[i] += cur;
            last_level_candies_num -= cur;
            if (last_level_candies_num <= 0) {
                break;
            }
        }
        return candies_distribute;
    }
}
