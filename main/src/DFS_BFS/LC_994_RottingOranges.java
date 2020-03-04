package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/4 4:54 PM
 */
public class LC_994_RottingOranges {
    /**
     * 多源广度优先思路
     * 1. 找到已经腐烂多橘子，放在一个队列中，作为第一层腐烂的橘子
     * 2. 开始对橘子进行腐化演进，并将上一层的橘子腐化，如果当前橘子前后左右有需要继续腐化的，入队，作为下一次腐化
     * 3. 记录腐化层级
     * 4. 判断是否全部腐化，如果还有未腐化的，返回-1
     */
    public int orangesRotting(int[][] grid) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        int count = 0;
        if (null == grid) return count;
        Queue<int[][]> queue = new LinkedList<>();
        // 找出已经腐化演进的橘子(第0次腐化)
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) queue.add(new int[][]{{i, j}});
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[][] currentNode = queue.poll();
                for (int k = 0; k < dx.length; k++) {
                    int x = currentNode[0][0] + dx[k], y = currentNode[0][1] + dy[k];
                    if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length) {
                        if (grid[x][y] == 1) {
                            grid[x][y] = 2;
                            queue.add(new int[][]{{x, y}});
                        }
                    }
                }
            }
            if (!queue.isEmpty()) {
                count++;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int v : grid[i]) {
                if (v == 1) return -1;
            }
        }
        return count;
    }

    /**
     * 橘子腐化演进：2rd 多腐化源 广度优先搜索
     */
    public int orangesRotting_2rd(int[][] grid) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        int count = 0;
        if (null == grid) return count;
        Queue<int[][]> queue = new LinkedList<>();
        // 找出已经腐化的橘子
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) queue.add(new int[][]{{i, j}});
            }
        }
        // 腐化演进
        while (!queue.isEmpty()) {
            // 队列中、当前腐化层次的橘子数，本层腐化完这个计数器的数据即可
            int curSize = queue.size();
            // 层次腐化
            while (curSize-- > 0) {
                int[][] curOrange = queue.poll();
                // 本橘子往4通腐化，如果腐化成功，则将新腐化的入队，以便作为下一层腐化的腐化源
                for (int k = 0; k < dy.length; k++) {
                    int x = curOrange[0][0] + dx[k], y = curOrange[0][1] + dy[k];
                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
                        if (grid[x][y] == 1) {
                            grid[x][y] = 2;
                            queue.add(new int[][]{{x, y}});
                        }
                    }
                }

            }
            if (!queue.isEmpty()) {
                count++;
            }

        }
        for (int i = 0; i < grid.length; i++) {
            for (int v : grid[i]) {
                if (v == 1) return -1;
            }
        }
        return count;
    }
}
