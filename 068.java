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
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
			return null;
		
		List<Integer> rsl = new ArrayList<Integer>();
		
		if(root.left != null) {
			rsl.addAll(postorderTraversal(root.left));
		}
		
		if(root.right != null) {
			rsl.addAll(postorderTraversal(root.right));
		}
		
		rsl.add(root.val);
		return rsl;
    }
}
