import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] A) {
        
        int i, temp;
        
        for(i=0; i<A.length; i++)
        {
            A[i] = A[i]*A[i];
        }
        
        
        Arrays.sort(A);
        
        return A;
    }
}