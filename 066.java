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
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
			return null;
		
		List<Integer> rsl = new ArrayList<Integer>();
		
		rsl.add(root.val);
		
		if(root.left != null) {
			rsl.addAll(preorderTraversal(root.left));
		}
		
		if(root.right != null) {
			rsl.addAll(preorderTraversal(root.right));
		}
		
		return rsl;			
    }
}
