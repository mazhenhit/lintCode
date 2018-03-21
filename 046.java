public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        int length = nums.size();
        int tmp = nums.get(0);
        int count = 1;
        for(int i = 1; i < length; i++) {
            if(count == 0) {
                count = 1;
                tmp = nums.get(i);
            } else if (tmp == nums.get(i)) {
                count++;
            } else {
                count--;
            }
        }
        return tmp;
    }
}
