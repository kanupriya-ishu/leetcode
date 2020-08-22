class Solution {
    public int dominantIndex(int[] nums) {
        int big = nums[0];
        int index=0;
        
        for(int i=0; i < nums.length; i++)
        {
            if (nums[i]>big)
            {
                big = nums[i];
                index = i;
            }
        }
        
        for(int i=0; i < nums.length; i++)
        {
            if (big < 2*nums[i] && nums[i]!=big)
            {
                return -1;
            }
        }
        
        return index;
    }
}