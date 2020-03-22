package linkedList;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/23 6:38 AM
 */
public class LC_876_MiddleOfTheLinkedListTest {
    @Test
    public void test_middle_of_the_linked_list() {
        LC_876_MiddleOfTheLinkedList ml = new LC_876_MiddleOfTheLinkedList();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        assertThat(ml.middleNode(head), is(3));
    }
}
