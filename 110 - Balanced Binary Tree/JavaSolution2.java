/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        boolean flg = true;
        if (root == null)
            return true;

        else if (root.left == null && root.right == null)
            return true;

        else{
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            if (Math.abs(left_height - right_height) > 1)
                flg = false;
            else
                flg = true;
        }

        return (flg && isBalanced(root.left) && isBalanced(root.right));

    }


    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(1+ maxDepth(root.left), 1 + maxDepth(root.right));
    }
}