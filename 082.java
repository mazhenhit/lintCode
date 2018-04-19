public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        if (A == null)
			return -1;
		
		int rsl = 0;
		for(int i : A) {
			rsl ^= i;
		}
			
		return rsl;
    }
}

