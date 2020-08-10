class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        l1 = list(set(range(1,len(nums)+1))-set(nums))
        return l1