class Solution {
    public boolean validMountainArray(int[] A) {
        int i, index=0;
        int n = A.length;
        
        if(n==0)
        {
            return false;
        }
        
        boolean flag1=false, flag2=false;
        
        if(n==0)
        {
            return false;
        }
        for(i=1; i<n; i++)
        {
            if(A[i] > A[i-1])
            {
                index = i;
            }
        }
        
        for(i=0; i<index; i++)
        {
            if(A[i] < A[i+1])
            {
               flag1 = true;
            }
            
            else{
                flag1 = false;
                break;
            }
        }
        
        for(i=index + 1; i<n; i++)
        {
            if(A[i] < A[i-1])
            {
               flag2 = true;
            }
            
            else{
                flag2 = false;
                break;
            }
        }
        if(flag1==true && flag2==true)
        {
            return true;
        }
        else{
            return false;
        }
        
    }
}