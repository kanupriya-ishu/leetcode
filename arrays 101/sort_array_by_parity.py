class Solution:
    def sortArrayByParity(self, A: List[int]) -> List[int]:
        B = []
        for i in A:
            if i% 2 == 0:
                B.append(i)
        for i in A:
            if i%2 != 0:
                B.append(i)
        return B