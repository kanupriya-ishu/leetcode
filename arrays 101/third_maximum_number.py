class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        l = list(set(nums))
        l.sort()
        if len(l)<3:
            return l[-1]
        return l[-3]