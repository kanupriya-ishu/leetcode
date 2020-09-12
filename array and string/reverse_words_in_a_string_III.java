class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" "); // Replace multiple white space with single white space using regex
    	
    	String ans = "";
    	
    	for(int i=0; i<arr.length; i++)
    	{
    		StringBuilder input1 = new StringBuilder(); 

            // append a string into StringBuilder input1 
            input1.append(arr[i]); 

            // reverse StringBuilder input1 
            input1 = input1.reverse(); 
            
            ans = ans + input1+ " ";
    	}
    	
    	return ans.trim();
    	
    }
}