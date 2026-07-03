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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;

        // Traverse until all nodes are processed
        while (curr != null) {

            // CASE 1: No left subtree
            // Visit node and move to right child
            if (curr.left == null) {
                ans.add(curr.val);
                curr = curr.right;
            }

            // CASE 2: Left subtree exists
            else {
                TreeNode prev = curr.left;

                // Find inorder predecessor (rightmost node of left subtree)
                // This node is used to create a temporary link back to curr
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                // CASE 2A: First visit to curr
                // Create a temporary thread to come back after left subtree
                if (prev.right == null) {
                    prev.right = curr;   // create thread
                    curr = curr.left;    // move to left subtree
                }

                // CASE 2B: Second visit to curr
                // Left subtree is already processed
                else {
                    prev.right = null;   // remove temporary thread
                    ans.add(curr.val);   // visit current node
                    curr = curr.right;   // move to right subtree
                }
            }
        }

        return ans;
    }
}