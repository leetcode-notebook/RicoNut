package DFS_BFS;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/4 4:52 PM
 */
public class LC_994_RottingOrangesTest {
    @Test
    public void rotting_oranges_test() {
        LC_994_RottingOranges rottingOranges = new LC_994_RottingOranges();
        assertThat(rottingOranges.orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        }), is(4));
        assertThat(rottingOranges.orangesRotting(new int[][]{
                {0, 2}
        }), is(0));
        assertThat(rottingOranges.orangesRotting(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        }), is(-1));
    }

    @Test
    public void rotting_oranges_2rd_test() {
        LC_994_RottingOranges rottingOranges = new LC_994_RottingOranges();
        assertThat(rottingOranges.orangesRotting_2rd(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        }), is(4));
        assertThat(rottingOranges.orangesRotting_2rd(new int[][]{
                {0, 2}
        }), is(0));
        assertThat(rottingOranges.orangesRotting_2rd(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        }), is(-1));
    }
}
