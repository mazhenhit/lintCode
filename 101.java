public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int index = 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
                count = 1;
            } else if (count < 2) {
                index++;
                nums[index] = nums[i];
                count++;
            }
        }
        return index + 1;
    }
}
