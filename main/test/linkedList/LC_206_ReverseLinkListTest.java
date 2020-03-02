package linkedList;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/2 10:58 PM
 */
public class LC_206_ReverseLinkListTest {

    /**
     * 执行用时 :
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗 :
     * 38.1 MB
     * , 在所有 Java 提交中击败了
     * 5.04%
     * 的用户
     */
    @Test
    public void reverseList_foreach_via_new_linkNode_test() {

        LC_206_ReverseLinkList reverseList = new LC_206_ReverseLinkList();

        ListNode head = new ListNode(1);
        ListNode inputNode2 = new ListNode(2);
        ListNode inputNode3 = new ListNode(3);
        ListNode inputNode4 = new ListNode(4);
        ListNode inputNode5 = new ListNode(5);
        head.next = inputNode2;
        inputNode2.next = inputNode3;
        inputNode3.next = inputNode4;
        inputNode4.next = inputNode5;

        ListNode resultNode = reverseList.reverseList_foreach_via_new_linkNode(head);
        String resStr = "";
        while (resultNode != null) {
            resStr += resultNode.val;
            resultNode = resultNode.next;
        }
        assertThat(resStr, is("54321"));
    }

    @Test
    public void reverseList_recursive_via_new_linkNode_test() {

        LC_206_ReverseLinkList reverseList = new LC_206_ReverseLinkList();

        ListNode head = new ListNode(1);
        ListNode inputNode2 = new ListNode(2);
        ListNode inputNode3 = new ListNode(3);
        ListNode inputNode4 = new ListNode(4);
        ListNode inputNode5 = new ListNode(5);
        head.next = inputNode2;
        inputNode2.next = inputNode3;
        inputNode3.next = inputNode4;
        inputNode4.next = inputNode5;
        inputNode5.next = null;

        ListNode resultNode = reverseList.reverseList_recursive_via_new_linkNode(head);
        String resStr = "";
        while (resultNode != null) {
            resStr += resultNode.val;
            resultNode = resultNode.next;
        }
//        assertThat(resStr, is("54321"));
    }

}
