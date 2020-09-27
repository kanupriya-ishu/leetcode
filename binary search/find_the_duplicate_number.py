class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        
        for i in range(len(nums)):
            nums[nums[i]%len(nums)] = nums[nums[i]%len(nums)] + len(nums)
            
        for i in range(len(nums)):
            if nums[i] >= 2*len(nums):
                return i