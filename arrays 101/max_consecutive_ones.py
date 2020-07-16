class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        large=count
        for i in range(len(nums)):
            if bin(nums[i])==bin(1):
                count+=1
            elif bin(nums[i])==bin(0):
                count=0
            if count>large:
                large=count
        return large

