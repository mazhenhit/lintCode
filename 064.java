public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
		int length = m + n;
		for(int i = length - 1; i >= 0; i--) {
			if(m > 0 && n > 0) {
			    A[i] = A[m - 1] > B[n - 1] ? A[m-- - 1] : B[n-- - 1];
			} else if(m > 0) {
			    break;
			} else if(n > 0) {
			    A[i] = B[n-- - 1];
			}
		}
    }
}
