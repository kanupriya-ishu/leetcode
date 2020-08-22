class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        big = max(nums)
        ind = nums.index(max(nums))
        for i in range(len(nums)):
            if big < 2*nums[i] and big!=nums[i]:
                return -1
        return ind