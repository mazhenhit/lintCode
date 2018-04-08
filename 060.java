public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        if(A == null)
			return -1;
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] == target)
				return i;
			else if(A[i] > target)
				return i;
		}
		
		return A.length;
    }
}
