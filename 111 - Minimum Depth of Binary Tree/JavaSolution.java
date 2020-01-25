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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        else if (root.left == null || root.right == null)
            return Math.max(1+minDepth(root.left), 1+minDepth(root.right));

        return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));
    }
}