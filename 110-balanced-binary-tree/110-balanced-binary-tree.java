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
    public boolean isBalanced(TreeNode root) {
        if(root != null) {
            int left = maxHeight(root.left);
            int right = maxHeight(root.right);
            boolean balanced = true;

            if(Math.abs(left - right) > 1)
                balanced = false;
            
            return balanced && isBalanced(root.left) && isBalanced(root.right);
        } else
            return true;
        
    }
    
    public int maxHeight(TreeNode root) {
        if(root != null)
            return Math.max(maxHeight(root.left) + 1, maxHeight(root.right) + 1);
        else
            return 0;
    }
    
}