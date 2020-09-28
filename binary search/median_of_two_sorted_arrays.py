class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        i=0
        j=0
        k=0
        
        merged =[]
        
        while i<len(nums1) and j<len(nums2):
            
            if nums1[i]<=nums2[j]:
                merged.append(nums1[i])
                k+=1
                i+=1
            else:
                merged.append(nums2[j])
                k+=1
                j+=1
                
        while i<len(nums1):
            merged.append(nums1[i])
            k+=1
            i+=1
        
        while j<len(nums2):
            merged.append(nums2[j])
            k+=1
            j+=1
        
        if(len(merged)%2==0):
            return (merged[(k-1)//2]+ merged[(k-1)//2+1])/2
        else:
            return merged[(k-1)//2]
        