class Solution {
    public int[] sortedSquares(int[] A) {
        
        int i, temp;
        
        for(i=0; i<A.length; i++)
        {
            A[i] = A[i]*A[i];
        }
        
        for(i=0; i<A.length; i++)
        {
            for(int j=0; j<A.length-1; j++)
            {
                if(A[j]>A[j+1])
                {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        
        return A;
    }
}