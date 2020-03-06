package tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 12:38 AM
 */
public class LC_145_BinaryTreePostOrderTraversalTest {
    @Test
    public void test_postorderTraversal_recur() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;
        LC_145_BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new LC_145_BinaryTreePostOrderTraversal();
        List<Integer> result = binaryTreePostOrderTraversal.postOrderTraversal_recur(root);
        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertThat(result, is(expected));
    }

    @Test
    public void test_postorderTraversal_loop() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;
        LC_145_BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new LC_145_BinaryTreePostOrderTraversal();
        List<Integer> result = binaryTreePostOrderTraversal.postOrderTraversal_loop(root);
        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertThat(result, is(expected));
    }
}
