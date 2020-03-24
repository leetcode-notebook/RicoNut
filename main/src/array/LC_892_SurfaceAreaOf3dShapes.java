package array;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/25 7:20 AM
 */
public class LC_892_SurfaceAreaOf3dShapes {
    /**
     * 题意：grid数组表示，在(i,j)的节点上放grid[i][j]个正方体, 计算网格上所有正方体的表面积
     * 解法：遍历过程中，计算总的正方体数量总面积，及重叠面积 最后相减即所得
     */
    public int surfaceArea(int[][] grid) {
        int sumSurfaceArea = 0, duplicateArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sumSurfaceArea += grid[i][j];
                if (j > 0) {
                    duplicateArea += Math.min(grid[i][j - 1], grid[i][j]);
                }
                if (i > 0) {
                    duplicateArea += Math.min(grid[i - 1][j], grid[i][j]);
                }
                if (grid[i][j] > 1) {
                    duplicateArea += (grid[i][j] - 1);
                }
            }
        }
        return sumSurfaceArea * 6 - duplicateArea * 2;
    }
}
