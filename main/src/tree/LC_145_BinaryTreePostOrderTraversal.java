package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 后序遍历：左右根
 *
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 12:42 AM
 */
public class LC_145_BinaryTreePostOrderTraversal {
    public List<Integer> postOrderTraversal_recur(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        if (root.left != null) {
            result.addAll(postOrderTraversal_recur(root.left));
        }
        if (root.right != null) {
            result.addAll(postOrderTraversal_recur(root.right));
        }
        result.add(root.val);
        return result;
    }

    /**
     * 逆序输出到链表结构中: 比如一个根节点、左节点、右节点；先将根节点放在链表头部，再将右节点放在链表头部，最后将左节点放在链表头部；最终顺序就是 左 右 根 (后序遍历)
     */
    public List<Integer> postOrderTraversal_loop(TreeNode head) {
        LinkedList<Integer> result = new LinkedList<>();
        if (null == head) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(head);
        TreeNode lastNode = head;
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.addFirst(cur.val); //
            if (cur.left != null) {
                stack.add(cur.left);
            }
            if (cur.right != null) {
                stack.add(cur.right);
            }
        }
        return result;
    }
}
