class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        inorderTraversal(root, nums); // Perform an inorder traversal to obtain a sorted list of elements
        int left = 0;
        int right = nums.size() - 1;
        
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum == k) {
                return true; // Found two elements that sum up to k
            } else if (sum < k) {
                left++; // Move the left pointer to increase the sum
            } else {
                right--; // Move the right pointer to decrease the sum
            }
        }
        
        return false; // No two elements sum up to k
    }
    
    private void inorderTraversal(TreeNode node, List<Integer> nums) {
        if (node == null) {
            return;
        }
        
        inorderTraversal(node.left, nums);
        nums.add(node.val); // Add the node's value to the list
        inorderTraversal(node.right, nums);
    }
}