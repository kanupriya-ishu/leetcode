class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int i=0, j=0, sum=0, min=nums.length+1;
        
        while(i < nums.length)
        {
            sum += nums[i++];
            
            while(sum >= s)
            {
                min = Math.min(min, i-j);
                sum -= nums[j++];
            }
        }
        
        return min==nums.length+1 ? 0 : min;
    }  
}