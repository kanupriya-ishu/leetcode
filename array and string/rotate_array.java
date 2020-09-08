class Solution {
    public void rotate(int[] nums, int k) {
        
        if(k>nums.length)
            k = k%nums.length;
        int[] nums2 = new int[nums.length];

        for(int i=k, j=0; i<nums.length; i++,j++)
        {
            nums2[i] = nums[j];
        }

        for(int i=0, j=nums.length-k; i<k; i++, j++)
        {
            nums2[i] = nums[j];
        }

        for(int i=0; i<nums.length; i++)
        {
            nums[i] = nums2[i];
        }

        
    }
}