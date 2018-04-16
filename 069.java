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
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rsl = new ArrayList<List<Integer>>();
		if(root == null) {
			return rsl;
		}
		LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
		linkedList.add(root);
		while(!linkedList.isEmpty()) {
			int count = linkedList.size();			
			List<Integer> tmpList = new ArrayList<>();			
			while(count-- > 0) {
				TreeNode node = linkedList.pollLast();
				if(node == null) {
				    continue;
				}
				tmpList.add(node.val);
				
				if(node.left != null) {
					linkedList.push(node.left);
				}
				
				if(node.right != null) {
					linkedList.push(node.right);
				}
			}
			
			if(tmpList.size() != 0)
			    rsl.add(tmpList);
		}
		return rsl;
    }
}
