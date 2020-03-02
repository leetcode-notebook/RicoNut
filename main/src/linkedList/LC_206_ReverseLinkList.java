package linkedList;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/2 11:03 PM
 */
public class LC_206_ReverseLinkList {

    /**
     * 解法1：迭代法 新建一个链表逆序承接head, 新建一个链表，翻倍消耗内存
     */
    public ListNode reverseList_foreach_via_new_linkNode(ListNode head) {
        ListNode result = null;
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = result;
            result = node;
            head = head.next;
        }
        return result;
    }

    /**
     * 解法2：递归 创建另一个链表承接
     */
    public ListNode reverseList_recursive_via_new_linkNode(ListNode head) {
        // terminate
        if (head == null || head.next == null) return head;
        // drill down
        ListNode cur = reverseList_foreach_via_new_linkNode(head.next);
        // process current
        head.next.next = head;
        head.next = null;
        // reset
        return cur;
    }
}