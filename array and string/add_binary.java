class Solution {
    public String addBinary(String a, String b) {
        String result = "";  
          
        // Initialize digit sum 
        int s = 0;          
  
        // Traverse both strings starting  
        // from last characters 
        int i = a.length() - 1, j = b.length() - 1; 
       while (i >= 0 || j >= 0 || s==1) // check if carry is 1
        { 
              
            // Compute sum of last  
            // digits and carry 
            s += ((i >= 0)? a.charAt(i) - '0': 0); // .charAt(i) - '0' => convert char to int
            s += ((j >= 0)? b.charAt(j) - '0': 0); 
  
            // If current digit sum is  
            // 1 or 3, add 1 to result 
            result = (char)(s % 2 + '0') + result; // .charAt(i) - '0' => convert int to char 
            // normally we do sum = sum + "" therefore char gets added up at right but when we do sum = "" + sum, char get added to left
  
            // Compute carry 
            s /= 2; 
  
            // Move to next digits 
            i--; j--; 
        }
          
    return result;
    }
}