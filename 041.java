public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        if(nums == null)
            return -999;
        int length = nums.length;
        int maxSum = nums[0];
        
        int tmpSum;
        for(int i = 0; i < length; i++) {
            tmpSum = 0;
            for(int j = i; j < length; j++) {
                tmpSum += nums[j];
                if(tmpSum > maxSum) {
                    maxSum = tmpSum;
                }
            }
        }
        return maxSum;
    }
}
