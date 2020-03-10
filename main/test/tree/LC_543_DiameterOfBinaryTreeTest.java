package tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/10 12:37 PM
 */
public class LC_543_DiameterOfBinaryTreeTest {
    @Test
    public void test_diameter_of_binary_tree() {
        LC_543_DiameterOfBinaryTree dbt = new LC_543_DiameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        root.left = node2;
        root.right = new TreeNode(3);
        node2.left = new TreeNode(4);
        node2.right = new TreeNode(5);
        assertThat(dbt.diameterOfBinaryTree(root), is(3));
    }
}
