public class Solution {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        if(nums == null)
            return;
        int length = nums.size();
        boolean stop = false;
        for(int i = 0; i < length && !stop; i++) {
            Integer a = nums.get(0);
            Integer b = nums.get(length - 1);
            if(a >= b) {
                nums.remove(a);
                nums.add(a);
            } else {
                stop = true;
            }
        }
    }
}
