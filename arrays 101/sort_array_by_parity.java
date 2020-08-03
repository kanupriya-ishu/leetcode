class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int[] B = new int[A.length];
        int len = 0;
        int len2 = A.length - 1;
        for(int i = 0; i<A.length; i++)
        {
            if (A[i] % 2 == 0)
            {
                B[len++] = A[i];
            }
            
            else
            {
                B[len2--] = A[i];
            }
        }
        
        return B;
        
    }
}