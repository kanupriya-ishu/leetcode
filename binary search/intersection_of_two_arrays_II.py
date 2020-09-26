class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        if len(nums1)==0: return nums1
        
        if len(nums2)==0: return nums2
        
        i=0
        j=0
        length=0
        
        nums1.sort()
        nums2.sort()
        
        while i<len(nums1) and j<len(nums2):
            if nums1[i]<nums2[j]:
                i+=1
            elif nums2[j]<nums1[i]:
                j+=1
            else:
                nums1[length]=nums1[i]
                length+=1
                i+=1
                j+=1
        
        return nums1[:length]