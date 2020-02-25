public class Solution {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        long sum = 0;

		while (n > 0 ) {
			sum += n / 5;
			n = n / 5;
		}
		return sum;
    }
}
