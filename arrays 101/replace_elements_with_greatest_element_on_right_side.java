class Solution {
    public int[] replaceElements(int[] arr) {
        
        int[] ans = new int[arr.length];
        ans[ans.length-1] = -1;
        int max = arr[arr.length-1];
        
        for(int i=arr.length-2; i>=0; i--)
        {
            max = max > arr[i+1] ? max : arr[i+1];
            ans[i] = max;
        }
        
        return ans;
        
    }
}