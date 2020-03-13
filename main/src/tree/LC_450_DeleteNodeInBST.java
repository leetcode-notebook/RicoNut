package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/13 1:06 PM
 */
public class LC_450_DeleteNodeInBST {
    /**
     * DFS
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return root;
        //如果当前节点为要删除的节点
        if(root.val==key){
            if(root.left!=null){
                if(root.right!=null){
                    TreeNode tmp = root.left;
                    while(tmp.right!=null)
                        tmp = tmp.right;
                    tmp.right = root.right;
                }
                return root.left;
            }
            if(root.right!=null){
                return root.right;
            }
            return null;
        }else {
            //否则递归左右节点
            root.left = deleteNode(root.left,key);
            root.right = deleteNode(root.right,key);
        }
        return root;
    }
}
