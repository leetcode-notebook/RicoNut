package tree;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/10 12:39 PM
 */
public class LC_543_DiameterOfBinaryTree {
    /**
     * 思路：路径以当前节点为根节点，经过的节点数
     */
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    private int depth(TreeNode root) {
        if (null == root) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;
    }
}

