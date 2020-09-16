class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0 || matrix==null)
            return new int[0];
        
        int[] arr = new int[matrix.length*matrix[0].length];
        int r=0;
        int c=0;
        int i=0;
        while(i<arr.length)
        {
            // Move up the diagonal
            while(i<arr.length && r>=0 && c<matrix[0].length)
            {
                arr[i++] = matrix[r--][c++];
            }
            r++;
            
            // if column number has reached maximum
            if(c==matrix[0].length)
            {
                r++;
                c--;
            }
            
            // Move down rhe diagonal
            while(i<arr.length && r<matrix.length && c>=0)
            {
                arr[i++] = matrix[r++][c--];
            }
            c++;
            
            // if row number has reached maximum
            if(r==matrix.length)
            {
                r--;
                c++;
            }
            
        }
        
        return arr;
    }
}