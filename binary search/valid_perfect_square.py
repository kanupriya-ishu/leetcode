class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num == 1: 
            return True
        
        l = 1
        h = num
        while l <= h:
            mid = l + int((h - l) / 2)
            if mid*mid == num:
                return True
            elif mid*mid > num : h = mid-1
            elif mid*mid < num : l = mid + 1
        return False