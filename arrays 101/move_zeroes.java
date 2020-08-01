class Solution {
    public void moveZeroes(int[] nums) {
        
        int length=0, count=0, n;
        n=nums.length;
        
        for(int i=0; i<n; i++)
        {
            if(nums[i]==0)
                count++;
        }
        
        for(int i=0; i<n; i++)
        {
            if (nums[i]!=0)
            {
                nums[length++] = nums[i];
            }
        }
        
        for (int i=(n-1); i>=n-count; i--)
        {
            nums[i] = 0;
        }
    }
}