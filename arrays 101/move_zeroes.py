class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        length = 0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[length] = nums[i]
                length += 1
        
        for i in range(length,len(nums)):
            nums[i] = 0