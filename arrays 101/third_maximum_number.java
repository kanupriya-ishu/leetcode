import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length<3)
        {
            return nums[nums.length-1];
        }
		int distinct=1;
		int length = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] != nums[length]) {
                nums[--length] = nums[i];
                ++distinct;
            }
        }
        int ans=0;
        for(int i=nums.length-1, count=0; i>=0 && count<3; i--, count++)
        {
            ans = nums[i];
        }
        if(distinct<3)
		{
			return nums[nums.length-1];
		}
        
        return ans;
    }
}