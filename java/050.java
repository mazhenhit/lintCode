public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        List<Long> rsl = new ArrayList<Long>();
        int length = nums.size();
        long tmp = 1;
        for(int i = 0 ; i < length; i++) {
            tmp = 1;
            for(int j = 0; j < i; j++) {
                tmp *= nums.get(j);
            }
            for(int k = length - 1; k > i; k--) {
                tmp *= nums.get(k);
            }
            rsl.add(tmp);
        }
        return rsl;
    }
}
