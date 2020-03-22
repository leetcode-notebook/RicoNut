package linkedList;

/**
 * 解法：
 * 1. 借助数组可以直接取下标的特性，将链表转化为数组，直接取数组的中位
 * 2. 遍历两次链表，第一次取得链表的总长度，第二次遍历到链表中间位置取目标值
 * 3. 快慢指针
 *
 * @since 2020/3/23 6:39 AM
 */
public class LC_876_MiddleOfTheLinkedList {
    /**
     * 快慢指针：用两个指针fast、slow一起遍历链表，slow一次走一步，fast一次走两步，当fast走到最后一个节点，slow处于中间节点
     */
    public int middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
