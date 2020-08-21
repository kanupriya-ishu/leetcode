class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0, sum2 = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            sum1 = sum1 + nums[i];
    
            sum2 = 0;
            for(int j=nums.length-1,count=0; j>=0; j--,count++)
            {
                sum2 = sum2 + nums[j];
                if(sum1==sum2 && count+i==nums.length-1)
                {
                    return i;
                }
            }
        }
        
        
        return -1;
    }
}