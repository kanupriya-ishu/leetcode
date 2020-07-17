class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
                
        for i in range(len(nums1)-m):
            del nums1[len(nums1)-1]
            
        for i in range(len(nums2)-n):
            del nums2[len(nums2)-1]
                
        for i in nums2:
            nums1.append(i)
        
        nums1.sort()