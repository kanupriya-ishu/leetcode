class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        if numRows == 1:
            return [[1]]
        
        if numRows == 2:
            return [[1], [1,1]]
        
        else:
            l = [[1], [1,1]]
            
            for i in range(2,numRows):
                sub = []
                for j in range(len(l[len(l)-1])-1):
                    sum_ = l[len(l)-1][j] + l[len(l)-1][j+1]
                    sub.append(sum_)
                sub.insert(0,1)
                sub.append(1)
                l.append(sub)
        return l