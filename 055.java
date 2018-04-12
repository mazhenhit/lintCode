public class Solution {
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
		int[] a = new int[26];
		
		for(int i = 0; i < 26; i++) {
			a[i] = 0;
		}
		
		for(int i = 0, aLen = A.length(); i < aLen; i++) {
			a[A.charAt(i) - 'A'] ++;
		}
		
		for(int i = 0, bLen = B.length(); i < bLen; i++) {
			a[B.charAt(i) - 'A']--;
			if(a[B.charAt(i) - 'A'] < 0) {
				return false;
			}
		}
		return true;
    }
}
