class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i;
        int large=0;
        int count=0;
        for(i=0; i<nums.length; i++)
        {
            
            if(nums[i]==1)
            {
                count++;
            }
            
            else if(nums[i]==0)
            {
                count=0;
            }
            if(count>large)
            {
                large=count;
            }
        }
        
        return large;
    }
}