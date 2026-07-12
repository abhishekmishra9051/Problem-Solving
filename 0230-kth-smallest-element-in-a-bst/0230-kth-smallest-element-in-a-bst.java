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
    List<Integer> answer;
    public int kthSmallest(TreeNode root, int k) {
        answer = new ArrayList<>();
        generator(root);
        return answer.get(k-1);
    }
    public void generator(TreeNode node){
        if(node == null) return;
        generator(node.left);
        answer.add(node.val);
        generator(node.right);
    }
}