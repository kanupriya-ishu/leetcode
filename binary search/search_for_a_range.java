class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int l=0, r=nums.length-1;
		int[] arr = {-1,-1};
		while(l<=r)
		{
			int mid = l + (r-l)/2;
			if (nums[mid]==target)
			{
				arr[0]=mid;
                r=mid-1;
			}
			
			else if(target < nums[mid]) {
				r = mid-1;
			}
			
			else {
				l=mid+1;
			}
		}
        
        l=0; r=nums.length-1;
		
        while(l<=r)
		{
			int mid = l + (r-l)/2;
			if (nums[mid]==target)
			{
				arr[1]=mid;
                l=mid+1;
			}
			
			else if(target < nums[mid]) {
				r = mid-1;
			}
			
			else {
				l=mid+1;
			}
		}
        
        return arr;
    }
}