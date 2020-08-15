class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)
            return -1;
        int d=0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]<nums[i-1])
            {
                d=i-1;
                break;
            }
        }
        
        int l=0, r=nums.length-1;
        
        if(nums[d]==target)
        	return d;
        else if(target<nums[d] && target>=nums[l])
        {
        	r=d-1;
        	while(l<=r)
        	{
        		int mid=l+(r-l)/2;
            	if(nums[mid]==target)
            	{
            		return mid;
            	}
            	
            	else if(target<nums[mid])
            	{
            		r=mid-1;
            	}
            	else {
            		l=mid+1;
            	}
            
        	}
        			
        }
        
        else 
        {
        	l=d+1;
        	while(l<=r)
        	{
        		int mid=l+(r-l)/2;
            	if(nums[mid]==target)
            	{
            		return mid;
            	}
            	
            	else if(target<nums[mid])
            	{
            		r=mid-1;
            	}
            	else {
            		l=mid+1;
            	}
            
        	}
        	
        }
        
        return -1;
    }
}