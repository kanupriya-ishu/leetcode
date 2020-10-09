class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];
        int len = 0; 
        for (int i = 0; i < arr.length && len<arr.length; i++) {
			if (arr[i]!=0)
            {
                ans[len++]=arr[i];
            }
            else
            {
                ans[len++]=0;
                if(len<arr.length)
                 ans[len++]=0;
            }
		}
        
        for(int i=0; i<ans.length; i++)
        {
            arr[i] = ans[i];
        }
        
    }
}