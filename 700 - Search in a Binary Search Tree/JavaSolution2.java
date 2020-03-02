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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        return helper(root, val);
    }

    public TreeNode helper(TreeNode root, int val){
        if (root.val == val){
            return root;
        }

        if (val < root.val && root.left != null){
            return helper(root.left, val);
        }

        if (val > root.val && root.right != null){
            return helper(root.right, val);
        }
        else{
            return null;
        }
    }



}