class Solution {
    public String reverseWords(String s) {

    	String[] arr = s.trim().replaceAll("( )+", " ").split(" "); // Replace multiple white space with single white space using regex
    	
    	String ans = "";
    	
    	for(int i=arr.length-1; i>=0; i--)
    	{
    		ans = ans + arr[i] + " ";
    	}
    	
    	return ans.trim();
    	
    }
}