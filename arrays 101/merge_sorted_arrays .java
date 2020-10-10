import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0, j=0, len=0;
        int[] nums3 = new int[nums1.length];
        
        while(i<m && j<n)
        {
            if (nums1[i]<nums2[j])
            {
                nums3[len++] = nums1[i++];
            }
            else
            {
                nums3[len++] = nums2[j++];
            }
        }
        
        
        while(i<m)
        {
            nums3[len++] = nums1[i++];
        }
        
        while(j<n)
        {
            nums3[len++] = nums2[j++];
        }
        
        for(int k=0; k<nums1.length; k++)
        {
            nums1[k] = nums3[k];
        }
    }
}