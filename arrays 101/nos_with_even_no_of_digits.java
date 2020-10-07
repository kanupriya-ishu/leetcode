class Solution {
    public int findNumbers(int[] nums) {
        int count=0, i;
        for(i=0; i<nums.length; i++)
        {
            int digit=0;
            String num = Integer.toString(nums[i]);
            
            if(num.length() % 2 == 0)
            {
                count++;
            }
        }
        
        return count;
    }
}