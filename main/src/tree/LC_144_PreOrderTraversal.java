package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author alis
 * @date 2019/10/27 12:55 AM
 * @description
 */
public class LC_144_PreOrderTraversal {


    /**
     * 二叉树前序遍历：根 左 右
     * 递归
     */
    public List<Integer> preOrderTraversalRecur(tree.TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        // terminator
        if (null == root) return nums;

        // process
        nums.add(root.val);

        // drill down
        if (root.left != null) nums.addAll(preOrderTraversalRecur(root.left));
        if (root.right != null) nums.addAll(preOrderTraversalRecur(root.right));

        // reverse states

        return nums;
    }

    /**
     * 栈迭代 前序遍历二叉树
     * 核心思想：先将根结点入栈，在while循环中取出，如果子结点不为空，先入栈右结点，再入栈左结点，
     * 继续while循环，输出根结点的值
     */
    public List<Integer> preOrderTraversalStack(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        if (null == root) return nums;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            nums.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return nums;
    }

    /**
     * 递归解法: 前序遍历： 根 左 右
     */
    public List<Integer> preOrderTraversalRecur_cur(TreeNode root) {
        // terminated
        if (null == root) return Collections.emptyList();
        // current process
        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        if (null != root.left) {
            result.addAll(preOrderTraversalRecur_cur(root.left));
        }
        if (null != root.right) {
            result.addAll(preOrderTraversalRecur_cur(root.right));
        }
        return result;
    }

    /**
     * 栈迭代法： 用栈结构的先进后出维护根节点需要后进先出的特性
     */
    public List<Integer> preOrderTraversalStack_loop(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if (cur.right != null) {
                stack.add(cur.right);
            }
            if (cur.left != null) {
                stack.add(cur.left);
            }
        }


        return result;
    }
}
