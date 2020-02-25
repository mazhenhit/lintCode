/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null)
			return true;
		
		if(root.left != null && root.right != null) {
			return isBalanced(root.left) && isBalanced(root.right);
		} else if (root.left != null) {
			return isMoreLevel(root.left);
		} else if (root.right != null) {
			return isMoreLevel(root.right);
		} else {
			return true;
		}
    }
	
	private boolean isMoreLevel(TreeNode root) {
		if(root.left != null || root.right != null) {
			return false;
		}
		return true;
	}
}
