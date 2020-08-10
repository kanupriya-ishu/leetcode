class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
		int count[] = new int[nums.length + 1]; 
		for (int i = 0; i < nums.length; i++)
			count[nums[i]]++; 
		for (int i = 1; i < count.length; i++) {
			if (count[i] == 0) 
				arr.add(i);
		}
		return arr;
    }