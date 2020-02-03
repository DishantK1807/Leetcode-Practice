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
    public TreeNode sortedArrayToBST(int[] nums) {

        int len = nums.length;

        if (len == 0)
            return null;

        int mid = len / 2;
        int left = mid - 1;
        TreeNode root;


        if (len == 1)
            return new TreeNode(nums[0]);
        else if (len == 2){
            root = new TreeNode(nums[1]);
            root.left = new TreeNode(nums[0]);
        }

        else if (len == 3){
            root = new TreeNode(nums[1]);
            root.left = new TreeNode(nums[0]);
            root.right = new TreeNode(nums[2]);
        }

        else{
            root = new TreeNode(nums[mid]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid +1 , len));
        }

        return root;
    }
}