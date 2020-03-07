package queue;

import java.util.LinkedList;

/**
 * 本算法基于问题的一个重要性质：当一个元素进入队列的时候，它前面所有比它小的元素就不会再对答案产生影响。
 *
 * @author liangqian0723@gmail.com
 * @since 2020/3/7 9:34 AM
 */
public class LCI_59_II_MaxValueInQueue {
    LinkedList<Integer> data;
    /**
     * 一个降序队列，最大值在队头。每次新增元素，会将降序队列中比当前元素小的元素出队，因为当前元素出队之前，不会有更小的元素作为最大值
     */
    LinkedList<Integer> maxQueue;

    public LCI_59_II_MaxValueInQueue() {
        maxQueue = new LinkedList<>();
        data = new LinkedList<>();
    }

    public void push_back(int value) {
        data.addLast(value);
        // 将MaxQueue队列中比当前元素小的都删除，因为当前元素出队之前，最大值都是当前元素
        while (!maxQueue.isEmpty() && value > maxQueue.peekLast()) {
            maxQueue.removeLast();
        }
        maxQueue.addLast(value);
    }

    public int pop_front() {
        if (data.isEmpty()) return -1;
        int ans = data.removeFirst();
        if (ans == maxQueue.peekFirst()) {
            maxQueue.removeFirst();
        }
        return ans;
    }

    public int max_value() {
        // 如果队列为空，返回-1
        return data.isEmpty() ? -1 : maxQueue.peekFirst();
    }
}
