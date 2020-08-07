class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
		
		int[] arr = new int[heights.length];
        
        if(heights.length==0) return 0;
		for(int i=0; i<heights.length; i++)
		{
			arr[i] = heights[i];
		}
		
		Arrays.sort(heights);
		
		for(int i=0; i<heights.length; i++)
		{
			if(arr[i] != heights[i])
			{
				count++;
			}
		}
		
        
        return count;
    }
}