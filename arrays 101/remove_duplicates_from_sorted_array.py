class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        length = 0
        for i in range(len(nums)):
            if nums[i]!=nums[length]:
                length+=1
                nums[length]=nums[i]
                
        return length+1