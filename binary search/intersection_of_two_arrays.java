class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        HashSet<Integer> s1=new HashSet();
        
        for(int i:nums1)
            s1.add(i);
        
        HashSet<Integer> s2=new HashSet();
            
        for(int i:nums2)
            s2.add(i);
        
        s1.retainAll(s2); // Intersection
        
        int[] ans = new int[s1.size()];
        int len = 0;
        for(int i : s1)
            ans[len++] = i;
        
        return ans;
        
    }
}