import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] A) {
        
        int[] squares = new int[A.length];
        
        int l =0;
        int r = A.length-1;
        int i =r;
        
        while(l<=r)
        {
            int sq1 = A[l]*A[l];
            int sq2 = A[r]*A[r];
            
            if (sq1 > sq2)
            {
                squares[i--] = sq1;
                l++;
            }
            else
            {
                squares[i--] = sq2;
                r--;
            }
        }
        
        return squares;
    }
}