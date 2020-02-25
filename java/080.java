public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        if (nums == null)
			return -1;
		
		int min = nums[0];
		int max = nums[0];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			Integer tmp = map.get(nums[i]);
			if(tmp == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], tmp + 1);
			}
			if(min > nums[i])
				min = nums[i];
			
			if(max < nums[i])
				max = nums[i];
		}
		
		int count = 0;
		for(int i = min; i <= max; i++) {
			Integer tmp = map.get(i);
			if(tmp == null)
				continue;
			count += tmp;
			
			if(count >= (nums.length + 1 ) / 2) {
				return i;
			}
		}
		
		return -1;
    }
}
