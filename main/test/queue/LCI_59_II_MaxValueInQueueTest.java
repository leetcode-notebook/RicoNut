package queue;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/7 9:31 AM
 */
public class LCI_59_II_MaxValueInQueueTest {
    @Test
    public void test_max_value_in_queue() {
        LCI_59_II_MaxValueInQueue maxValueInQueue = new LCI_59_II_MaxValueInQueue();
        maxValueInQueue.push_back(1);
        maxValueInQueue.push_back(2);

        assertThat(maxValueInQueue.max_value(), is(2));

        assertThat(maxValueInQueue.pop_front(), is(1));
        assertThat(maxValueInQueue.pop_front(), is(2));

        assertThat(maxValueInQueue.max_value(), is(-1));

    }
}
