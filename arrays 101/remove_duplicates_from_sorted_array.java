class Solution {
    public int removeDuplicates(int[] nums) {
        // REMOVE DUPLICATES IN ANY ARRAY
		/*
		int length=0;
        int flag;
        int i,j;
        for(i=0; i<nums.length; i++)
        {
            flag=0;
            for(j=0; j<i; j++)
            {
                if(nums[i]==nums[j])
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag==0)
            {
                nums[length++]=nums[i];
            }
        }
        
        return length;
		*/
		
		// REMOVE DUPLICATES IN SORTED ARRAY
		if (nums.length == 0) return 0;
        int length = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[length]) {
                nums[++length] = nums[j];
            }
        }
        return length + 1;
    }
}