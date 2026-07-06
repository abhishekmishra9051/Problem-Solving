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
    // Function to perform level-order traversal of a binary tree
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Create a list to store the levels
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            // If the tree is empty, return an empty list
            return ans;
        }
        
        // Create a queue to store nodes for level-order traversal
        Queue<TreeNode> q = new LinkedList<>();
        // Add the root node to the queue
        q.add(root);
        
        while (!q.isEmpty()) {
            // Get the size of the current level
            int size = q.size();
            // Create a list to store nodes at the current level
            List<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                // Get the front node from the queue
                TreeNode node = q.poll();
                // Add the node value to the current level list
                level.add(node.val);
                
                // Enqueue the child nodes if they exist
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            // Add the current level to the answer list
            ans.add(level);
        }
        // Return the level-order traversal of the tree
        return ans;
    }
}
