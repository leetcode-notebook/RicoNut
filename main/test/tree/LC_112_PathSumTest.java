package tree;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/6 5:39 PM
 */
public class LC_112_PathSumTest {
    @Test
    public void has_path_sum_recur_test() {
        TreeNode root = new TreeNode(5);
        TreeNode rootLeft4 = new TreeNode(4);
        TreeNode rootRight8 = new TreeNode(8);
        root.left = rootLeft4;
        root.right = rootRight8;

        TreeNode rootLeft4Left11 = new TreeNode(11);
        rootLeft4.left = rootLeft4Left11;

        TreeNode rootRight8Left13 = new TreeNode(13);
        TreeNode rootRight8Right4 = new TreeNode(4);

        rootRight8.left = rootRight8Left13;
        rootRight8.right = rootRight8Right4;

        rootLeft4Left11.left = new TreeNode(7);
        rootLeft4Left11.right = new TreeNode(2);

        rootRight8Right4.right = new TreeNode(1);

        LC_112_PathSum pathSum = new LC_112_PathSum();
        assertTrue(pathSum.hasPathSum_recur(root, 22));

    }

    @Test
    public void has_path_sum_dfs_test() {
        TreeNode root = new TreeNode(5);
        TreeNode rootLeft4 = new TreeNode(4);
        TreeNode rootRight8 = new TreeNode(8);
        root.left = rootLeft4;
        root.right = rootRight8;

        TreeNode rootLeft4Left11 = new TreeNode(11);
        rootLeft4.left = rootLeft4Left11;

        TreeNode rootRight8Left13 = new TreeNode(13);
        TreeNode rootRight8Right4 = new TreeNode(4);

        rootRight8.left = rootRight8Left13;
        rootRight8.right = rootRight8Right4;

        rootLeft4Left11.left = new TreeNode(7);
        rootLeft4Left11.right = new TreeNode(2);

        rootRight8Right4.right = new TreeNode(1);

        LC_112_PathSum pathSum = new LC_112_PathSum();
        assertTrue(pathSum.hasPathSum_dfs(root, 22));

    }
}
