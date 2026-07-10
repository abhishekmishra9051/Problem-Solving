/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    // Function to connect next pointers in-place
    public Node connect(Node root) {
        // Return if tree is empty
        if(root == null) return null;

        // Start from root level
        Node levelStart = root;

        // Traverse all levels until leaves
        while(levelStart.left != null) {
            Node curr = levelStart;

            // Traverse nodes in current level using next pointers
            while(curr != null) {
                // Connect left child to right child
                curr.left.next = curr.right;

                // Connect right child to next node's left child if next exists
                if(curr.next != null) curr.right.next = curr.next.left;

                // Move to next node in level
                curr = curr.next;
            }

            // Move to next level
            levelStart = levelStart.left;
        }

        return root;
    }
}
