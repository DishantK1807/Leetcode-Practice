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
        int height = 0;
        if (root == null)
            return true;
        int l_height = root.left == null ? 0 : maxDepth(root.left);
        int r_height = root.right == null ? 0 : maxDepth(root.right);
        int diff = Math.abs(l_height - r_height);

        if (diff > 1){
            return false;
        }

        return (isBalanced(root.left) && isBalanced(root.right));
    }


    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;


        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }
}