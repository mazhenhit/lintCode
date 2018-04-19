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
    /*
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        if(root == null)
			return node;
		
		TreeNode nodePre = null;
		TreeNode nodeCurr = root;
		while(nodeCurr != null) {
			nodePre = nodeCurr;
			if(nodeCurr.val > node.val)
				nodeCurr = nodeCurr.left;
			else
				nodeCurr = nodeCurr.right;
		}
		
		if(nodePre.val > node.val)
			nodePre.left = node;
		else
			nodePre.right = node;
		return root;
    }
}
