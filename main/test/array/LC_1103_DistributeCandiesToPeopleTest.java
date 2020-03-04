package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/5 6:00 AM
 */
public class LC_1103_DistributeCandiesToPeopleTest {
    @Test
    public void distributeCandies_loop_test() {
        LC_1103_DistributeCandiesToPeople distributeCandiesToPeople = new LC_1103_DistributeCandiesToPeople();
        assertThat(distributeCandiesToPeople.distributeCandies_loop(7, 4), is(new int[]{1, 2, 3, 1}));
        assertThat(distributeCandiesToPeople.distributeCandies_loop(10, 3), is(new int[]{5, 2, 3}));
        assertThat(distributeCandiesToPeople.distributeCandies_loop(60, 4), is(new int[]{15, 18, 15, 12}));
    }

    @Test
    public void distributeCandies_math_test() {
        LC_1103_DistributeCandiesToPeople distributeCandiesToPeople = new LC_1103_DistributeCandiesToPeople();
//        assertThat(distributeCandiesToPeople.distributeCandies_math(7, 4), is(new int[]{1, 2, 3, 1}));
//        assertThat(distributeCandiesToPeople.distributeCandies_math(10, 3), is(new int[]{5, 2, 3}));
//        assertThat(distributeCandiesToPeople.distributeCandies_math(60, 4), is(new int[]{15, 18, 15, 12}));
    }
}
