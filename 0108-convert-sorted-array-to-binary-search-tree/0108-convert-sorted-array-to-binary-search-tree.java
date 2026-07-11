/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Start building the BST using the entire array
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int low, int high) {

        // Base case: no elements left in this range
        if (low > high) {
            return null;
        }

        // Find the middle element to keep the BST height-balanced
        int mid = low + (high - low) / 2;

        // Create the root node with the middle element
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build the left subtree
        // Elements before 'mid' are smaller than the root
        root.left = helper(nums, low, mid - 1);

        // Recursively build the right subtree
        // Elements after 'mid' are greater than the root
        root.right = helper(nums, mid + 1, high);

        // Return the constructed subtree
        return root;
    }
}