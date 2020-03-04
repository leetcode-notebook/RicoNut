package DFS_BFS;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/4 3:39 PM
 */
public class LC_200_NumberOfIslandsTest {
    @Test
    public void numIsIslands_DFS_test() {
        LC_200_NumberOfIslands numberOfIslands = new LC_200_NumberOfIslands();
        assertThat(numberOfIslands.numsIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        }), is(1));
        assertThat(numberOfIslands.numsIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        }), is(3));
    }
}
