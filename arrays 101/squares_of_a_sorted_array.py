class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        B = [i**2 for i in A]
        return sorted(B)