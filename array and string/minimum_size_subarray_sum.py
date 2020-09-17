class Solution:
    def minSubArrayLen(self, s: int, nums: List[int]) -> int:
        i = 0
        j = 0
        minimum = len(nums) + 1
        total = 0
        
        while i < len(nums):
            total = total + nums[i]
            i += 1
            
            while total >= s:
                minimum = min(minimum, i-j)
                total = total - nums[j]
                j += 1
                
        if minimum == len(nums) + 1:
            return 0
        else:
            return minimum