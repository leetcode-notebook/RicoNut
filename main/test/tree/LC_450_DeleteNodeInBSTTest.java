package tree;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/13 1:05 PM
 */
public class LC_450_DeleteNodeInBSTTest {
    @Test
    public void test_delete_node_in_bst() {
        LC_450_DeleteNodeInBST dni = new LC_450_DeleteNodeInBST();
        TreeNode root = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        root.left = node3;
        root.right = node6;
        node3.left = new TreeNode(2);
        node3.right = new TreeNode(4);
        node6.right = new TreeNode(7);
        int key = 3;
        TreeNode result = dni.deleteNode(root, key);
        List<Integer> rs = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(result);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode poll = queue.poll();
                rs.add(poll.val);
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
        }
        assertThat(rs, is(Arrays.asList(5, 3, 6, 2, 4, 7)));
    }
}
