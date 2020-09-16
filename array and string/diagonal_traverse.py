class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not(matrix):
            return []
        i=0
        arr = []
        r=0
        c=0
        
        while i<len(matrix)*len(matrix[0]):
            
            # Move up the diagonal
            while(i<len(matrix)*len(matrix[0]) and r>=0 and c<len(matrix[0])):
                arr.append(matrix[r][c])
                r-=1
                c+=1
                i+=1
            r+=1
            
            # if column reached its maximum length
            if c==len(matrix[0]):
                c-=1
                r+=1
            
            # Move down the diagonal
            while(i<len(matrix)*len(matrix[0]) and r<len(matrix) and c>=0):
                arr.append(matrix[r][c])
                r+=1
                c-=1
                i+=1
            c+=1
            
            # if row reached its maximum length
            if r==len(matrix):
                c+=1
                r-=1
        
        return arr