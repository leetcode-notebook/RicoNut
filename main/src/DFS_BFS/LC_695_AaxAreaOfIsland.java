package DFS_BFS;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/16 11:49 AM
 */
public class LC_695_AaxAreaOfIsland {
    int[] dx = new int[]{1, -1, 0, 0};
    int[] dy = new int[]{0, 0, 1, -1};

    /**
     * 沉岛解法: 如果一个格子是岛屿，将岛屿沉掉，并遍历该格子前后左右(4通)的格子是否为岛屿，并且沉掉，直到将所有的岛屿都沉了
     */
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int hasSink = sink(i, j, grid);
                    maxArea = Math.max(hasSink, maxArea);
                }
            }
        }
        return maxArea;
    }

    private int sink(int i, int j, int[][] grid) {
        int hasSink = 1;
        grid[i][j] = 0;
        for (int k = 0; k < dx.length; ++k) {
            int m = i + dx[k];
            int n = j + dy[k];
            if (m < 0 || m >= grid.length || n < 0 || n >= grid[0].length) {
                continue;
            }
            if (grid[m][n] == 1) {
                hasSink += sink(m, n, grid);
            }
        }
        return hasSink;
    }


}
