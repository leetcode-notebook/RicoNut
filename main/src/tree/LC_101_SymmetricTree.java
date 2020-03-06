package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 4:38 PM
 */
public class LC_101_SymmetricTree {
    /**
     * 递归法：将传入的树，分别进行递归对比每一个节点 (t1.val == t2.val) (t1.right, t2.left)(t1.left, t2.right)
     */
    public boolean isSymmetric_recur(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }

    /**
     * 迭代法： 用队列，队列中每两个节点直接如果都是相等的，则互为镜像
     */
    public boolean isSymmetric_loop(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }
        return true;
    }
}
