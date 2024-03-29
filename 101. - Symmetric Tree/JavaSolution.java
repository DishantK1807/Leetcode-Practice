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
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }

    public boolean helper(TreeNode right, TreeNode left){
        if(right == null && left == null)
            return true;
        if (right== null || left == null)
            return false;

        return ((right.val == left.val) && helper(right.left, left.right) && helper(right.right, left.left));
    }
}