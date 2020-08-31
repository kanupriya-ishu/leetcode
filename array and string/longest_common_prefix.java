class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0)
        {
            return "";
        }
        String small = strs[0];
        String str = "";
        
        for(int i=0; i<strs.length; i++)
        {
            if(strs[i].length()<small.length())
            {
                small = strs[i];
            }
        }
        
        for(int i=0; i<small.length(); i++)
        {
            boolean flag = true;
            char c = small.charAt(i);
            
            for(int j=0; j<strs.length; j++)
            {
                if(strs[j].charAt(i)!=c)
                {
                    flag = false;
                    break;
                }
            }
            
            if (flag==false)
            {
                break;
            }
            else
            {
                str = str + c;
            }
        }
        
        return str;
        
    }
}