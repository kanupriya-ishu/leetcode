class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix: 
            return []
        r1 = 0
        c1 = 0
        r2 = len(matrix)
        c2 = len(matrix[0])
        
        l = []
        
        while r1<r2 and c1<c2:
            # Move to right
            # Traverse first row from remaining rows
            for i in range(c1,c2):
                l.append(matrix[r1][i])
            r1 += 1
            
            # Move downwards
            # Traverse last column from remaining columns
            for i in range(r1,r2):
                l.append(matrix[i][c2-1])
            c2 -= 1
            
            # Move to left
            # Traverse last row from remaining rows
            if r1<r2:
                for i in range(c2-1, c1-1, -1):
                    l.append(matrix[r2-1][i])
                r2 -= 1
            
            # Move upwards
            # Traverse first column from remaining columns
            if c1<c2:
                for i in range(r2-1, r1-1, -1):
                    l.append(matrix[i][c1])
                c1 += 1
            
        return l