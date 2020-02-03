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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<List<Integer>> output = new ArrayList<>();
        helper(output, 1, root);

        return output;
    }

    public void helper(List<List<Integer>> output, int level, TreeNode root){
        if (root == null)
            return;
        if (level - 1 == output.size())
            output.add(0, new ArrayList<>());

        helper(output, level + 1, root.left);
        helper(output, level + 1, root.right);

        int index = output.size() - level;
        output.get(index).add(root.val);
    }
}