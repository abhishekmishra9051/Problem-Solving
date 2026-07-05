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
    private void rightView(TreeNode curr, List<Integer> ans, int currLevel){
        if(curr == null ) return ;
        if(currLevel == ans.size()) ans.add(curr.val);
        rightView(curr.right, ans, currLevel + 1);
        rightView(curr.left, ans, currLevel + 1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(root, ans, 0);
        return ans;
    }
}