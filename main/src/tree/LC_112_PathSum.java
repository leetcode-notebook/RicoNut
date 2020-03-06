package tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 5:52 PM
 */
public class LC_112_PathSum {
    /**
     * 递归解法
     */
    public boolean hasPathSum_recur(TreeNode root, int sum) {
        if (root != null && root.left == null && root.right == null) {
            return sum == root.val;
        }
        if (root == null && sum == 0) return false;
        if (root == null) return false;
        return hasPathSum_recur(root.left, sum - root.val) || hasPathSum_recur(root.right, sum - root.val);
    }

    public boolean hasPathSum_dfs(TreeNode root, int sum) {
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> nodeSum = new Stack<>();
        nodeSum.add(sum - root.val);
        nodeStack.add(root);
        while (!nodeStack.isEmpty()) {
            TreeNode treeNode = nodeStack.pop();
            int curSum = nodeSum.pop();
            if (treeNode.left == null && treeNode.right == null && curSum == 0) {
                return true;
            }
            if (treeNode.right != null) {
                nodeStack.add(treeNode.right);
                nodeSum.add(curSum - treeNode.right.val);
            }
            if (treeNode.left != null) {
                nodeStack.add(treeNode.left);
                nodeSum.add(curSum - treeNode.left.val);
            }
        }
        return false;
    }
}
