package DFS_BFS;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/4 4:06 PM
 */
public class LC_200_NumberOfIslands {
    // 方向向量数组
    int[] dx = new int[]{-1, 1, 0, 0};
    int[] dy = new int[]{0, 0, -1, 1};

    char[][] g;

    /**
     * floatfill 洪水算法: 每次将一个格子相连的并且为1的格子敲掉，沉入，让它置为0
     */
    public int numsIslands(char[][] grid) {
        int isLands = 0;
        g = grid;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                if (g[i][j] == '0') continue;
                isLands += sink(i, j);
            }
        }
        return isLands;
    }

    private int sink(int i, int j) {
        // terminated
        if (g[i][j] == '0') return 0;
        // 沉掉当前的岛
        g[i][j] = '0';
        // 分别对当前格子的前后左右方向进行判断，如果是岛屿(==1)，则将它沉掉(->0),
        // 如果不是岛屿，则终止蔓延，不需要再去发散寻找岛屿，反正也找不到
        for (int k = 0; k < dx.length; k++) {
            int x = i + dx[k], y = j + dy[k];
            if (x >= 0 && y >= 0 && x < g.length && y < g[i].length) {
                if (g[x][y] == '0') continue;
                sink(x, y);
            }
        }
        return 1;
    }
}
