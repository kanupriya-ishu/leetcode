class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0;
        double[] merged = new double[nums1.length+nums2.length];
        
        
        while(i<nums1.length&& j<nums2.length)
        {
    		if(nums1[i]<=nums2[j])
            {
                merged[k++] = nums1[i++];
            }
            
            else if(nums2[j]<=nums1[i])
            {
                merged[k++] = nums2[j++];
            }
            
        }
        
        while(i<nums1.length)
        {
        	merged[k++] = nums1[i++];
        }
        
        while(j<nums2.length)
        {
        	merged[k++] = nums2[j++];
        }
        
        if(merged.length%2==0)
        {
            return (merged[(k-1)/2]+ merged[(k-1)/2+1])/2;
        }
        
        else
        {
            return merged[(k-1)/2];
        }
        
    
        
    }
}