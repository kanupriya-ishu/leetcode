class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2)
        {
            sum = sum + min(nums[i], nums[i+1]);
        }
        
        return sum;
    }
    
    public static int min(int a, int b)
    {
        return a<b ? a : b;
    }
}