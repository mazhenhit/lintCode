public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null)
			return null;
		
		for(int i = 0; i < numbers.length; i++) {
			int tmp = target - numbers[i];
			for(int j = i + 1; j < numbers.length; j++) {
				if(tmp == numbers[j]) {
					return new int[]{i, j};
				}
			}
		}
		return null;
    }
}
