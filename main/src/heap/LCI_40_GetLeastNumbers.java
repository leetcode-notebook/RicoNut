package heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/20 6:33 AM
 */
public class LCI_40_GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        if (null == arr || arr.length == 0) return res;
        // 最大堆：Java中的PriorityQueue是实现堆，默认是小顶堆，可以实现compare来定义大顶堆
        Queue<Integer> maxHeap = new PriorityQueue<>(k, (i, j) -> Integer.compare(j, i));
        for (int a : arr) {
            maxHeap.add(a);
            // 堆中限定 如果超过k，则将最大值出队
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = maxHeap.poll();
        }
        return res;
    }
}
