class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        sum2 = 0
        
        for i in range(len(nums)):
            if(sum2 == sum(nums) - sum2 - nums[i]):
                return i
            sum2 = sum2 + nums[i]
        return -1