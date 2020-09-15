class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List l = new ArrayList();
        if (matrix.length==0)
            return l;
        
        int r1=0, c1 =0;
        int r2 = matrix.length;
        int c2 = matrix[0].length;
        
        while(r1<r2 && c1<c2)
        {
            // Move to right
            // Traverse first row from remaining rows
            for(int i=c1; i<c2; i++)
                l.add(matrix[r1][i]);
            r1++;
            
            // Move downwards
            // Traverse last column from remaining columns
            for(int i=r1; i<r2; i++)
                l.add(matrix[i][c2-1]);
            c2--;
            
            // Move to left
            // Traverse last row from remaining rows
            if(r1<r2)
            {
                for(int i=c2-1; i>=c1; i--)
                    l.add(matrix[r2-1][i]);
                r2--;
            }
            
            // Move upwards
            // Traverse first column from remaining columns
            if(c1<c2)
            {
                for(int i=r2-1; i>=r1; i--)
                    l.add(matrix[i][c1]);
                c1++;
            }
        }
        
        return l;
        
    }
}