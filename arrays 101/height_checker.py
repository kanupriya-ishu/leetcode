class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        count = 0
        l1 = []
        if len(heights) == 0:
            return 0
        l1 = sorted(heights)
        for i in range(len(heights)):
            if heights[i] != l1[i]:
                count += 1
        return count
