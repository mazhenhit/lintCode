public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        int minEnd = nums.get(0);
        int minCur = nums.get(0);
        
        int length = nums.size();
        for(int i = 1; i < length; i++) {
            minEnd = nums.get(i) > nums.get(i) + minEnd ? nums.get(i) + minEnd : nums.get(i);
            minCur = minCur > minEnd ? minEnd : minCur;
        }
        return minCur;
    }
}
