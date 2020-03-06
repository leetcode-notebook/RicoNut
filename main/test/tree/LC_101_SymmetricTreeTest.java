package tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 4:37 PM
 */
public class LC_101_SymmetricTreeTest {
    @Test
    public void is_symmetric_recur_test_1() {
        LC_101_SymmetricTree symmetricTree = new LC_101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        TreeNode rootNode2Left = new TreeNode(2);
        TreeNode rootNode2Right = new TreeNode(2);
        root.left = rootNode2Left;
        root.right = rootNode2Right;
        rootNode2Left.left = new TreeNode(3);
        rootNode2Left.right = new TreeNode(4);

        rootNode2Right.left = new TreeNode(4);
        rootNode2Right.right = new TreeNode(3);

        assertThat(symmetricTree.isSymmetric_recur(root), is(true));
    }

    @Test
    public void is_symmetric_recur_test_2() {
        LC_101_SymmetricTree symmetricTree = new LC_101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        TreeNode rootNode2Left = new TreeNode(2);
        TreeNode rootNode2Right = new TreeNode(2);
        root.left = rootNode2Left;
        root.right = rootNode2Right;
        TreeNode rootNode2LeftNode4Right = new TreeNode(4);
        rootNode2Left.right = rootNode2LeftNode4Right;
        TreeNode rootNode2RightNode4Right = new TreeNode(4);
        rootNode2Right.right = rootNode2RightNode4Right;

        assertThat(symmetricTree.isSymmetric_recur(root), is(false));
    }

    @Test
    public void is_symmetric_recur_test_3() {
        LC_101_SymmetricTree symmetricTree = new LC_101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        TreeNode rootNode2Left = new TreeNode(2);
        TreeNode rootNode2Right = new TreeNode(3);
        root.left = rootNode2Left;
        root.right = rootNode2Right;
        assertThat(symmetricTree.isSymmetric_recur(root), is(false));
    }

    @Test
    public void is_symmetric_loop_test_1() {
        LC_101_SymmetricTree symmetricTree = new LC_101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        TreeNode rootNode2Left = new TreeNode(2);
        TreeNode rootNode2Right = new TreeNode(2);
        root.left = rootNode2Left;
        root.right = rootNode2Right;
        rootNode2Left.left = new TreeNode(3);
        rootNode2Left.right = new TreeNode(4);

        rootNode2Right.left = new TreeNode(4);
        rootNode2Right.right = new TreeNode(3);

        assertThat(symmetricTree.isSymmetric_loop(root), is(true));
    }

    @Test
    public void is_symmetric_loop_test_2() {
        LC_101_SymmetricTree symmetricTree = new LC_101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        TreeNode rootNode2Left = new TreeNode(2);
        TreeNode rootNode2Right = new TreeNode(2);
        root.left = rootNode2Left;
        root.right = rootNode2Right;
        TreeNode rootNode2LeftNode4Right = new TreeNode(4);
        rootNode2Left.right = rootNode2LeftNode4Right;
        TreeNode rootNode2RightNode4Right = new TreeNode(4);
        rootNode2Right.right = rootNode2RightNode4Right;

        assertThat(symmetricTree.isSymmetric_loop(root), is(false));
    }

    @Test
    public void is_symmetric_loop_test_3() {
        LC_101_SymmetricTree symmetricTree = new LC_101_SymmetricTree();
        TreeNode root = new TreeNode(1);
        TreeNode rootNode2Left = new TreeNode(2);
        TreeNode rootNode2Right = new TreeNode(3);
        root.left = rootNode2Left;
        root.right = rootNode2Right;
        assertThat(symmetricTree.isSymmetric_loop(root), is(false));
    }
}
