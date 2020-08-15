class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if len(nums)==0:
            return -1
    
        d = 0
        
        for i in range(1,len(nums)):
            if nums[i] < nums[i-1]:
                d=i-1
                break
        
        l=0
        r=len(nums)-1
        
        if nums[d] == target:
            return d
        elif target<nums[d] and target >= nums[l]:
            r=  d-1
            while l<=r:
                mid = (l+r)//2
                if nums[mid] == target:
                    return mid
                elif target<nums[mid]:
                    r = mid-1
                else:
                    l=mid+1
        else:
            l = d+1
            while l<=r:
                mid = (l+r)//2
                if nums[mid] == target:
                    return mid
                elif target<nums[mid]:
                    r = mid-1
                else:
                    l=mid+1
        return -1