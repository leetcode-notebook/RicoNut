package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author alis
 * @date 2019/11/1 12:17 AM
 * @description
 */
public class LC_102_BinaryTreeLevelOrder {

    List<List<Integer>> result = new ArrayList<>();


    /**
     * BFS
     * 时间复杂度：O(n)
     */
    public List<List<Integer>> levelOrderBFS(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int level) {
        // init level 0
        if (level == result.size())
            result.add(new ArrayList<>());
        // process current
        result.get(level).add(root.val);
        // drill down
        if (null != root.left)
            helper(root.left, level + 1); // 同一个level层的数据都会同样处理，并只处理一遍
        if (null != root.right)
            helper(root.right, level + 1);
    }

    public List<List<Integer>> levelOrderLoop(TreeNode root) {
        if (null == root) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> current = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                current.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(current);
        }
        return result;
    }

    public List<List<Integer>> levelOrderQueue(TreeNode treeNode) {
        List<List<Integer>> result = new ArrayList<>();
        if (treeNode == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> cur = new ArrayList<>();
            while (size-- > 0) { // 遍历本层，直至计数器清空为止
                TreeNode node = queue.poll();
                cur.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(cur);
        }
        return result;
    }

    public List<List<Integer>> levelOrderRecur2(TreeNode treeNode) {
        List<List<Integer>> result = new ArrayList<>();
        _helper(treeNode, 0, result);
        return result;
    }

    private void _helper(TreeNode treeNode, int level, List<List<Integer>> result) {
        // init 初始化
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }

        // process current level
        result.get(level).add(treeNode.val);

        // drill down
        if (null != treeNode.left)
            _helper(treeNode.left, level + 1, result);
        if (null != treeNode.right)
            _helper(treeNode.right, level + 1, result);

    }

    /**
     * BFS思路：用queue解决，每一层的节点，输出当前节点的时候，都去判断是否有子节点，按并将子节点顺序入队
     */
    public List<List<Integer>> levelOrderBFS_2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            // 由于需要将每一层的节点入队，需要判断队列中那些数据是属于本层的，
            // 通过开始遍历本层之前，记录这一层节点数量，每出队一个节点，计数器减少1，直至减少为0
            int currentQueueSize = queue.size();
            List<Integer> curList = new ArrayList<>();
            while (currentQueueSize-- > 0) {
                TreeNode cur = queue.poll();
                curList.add(cur.val);
                if (cur.left != null)
                    queue.add(cur.left);
                if (cur.right != null)
                    queue.add(cur.right);
            }
            result.add(curList);
        }
        return result;
    }

    /**
     * 递归
     */
    public List<List<Integer>> levelOrder_recur_2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        _recur_help(root, 0, result);
        return result;
    }

    private void _recur_help(TreeNode root, int level, List<List<Integer>> result) {
        // 初始化数组：根据层级编号，如果数组在本层尚未进行初始化，需要初始化本层的数组
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        if (root.left != null) {
            _recur_help(root.left, level + 1, result);
        }
        if (root.right != null) {
            _recur_help(root.right, level + 1, result);
        }
    }
}
