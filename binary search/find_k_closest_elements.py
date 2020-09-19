class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        l = 0
        h = len(arr) - 1
        
        while h-l >= k:
            if abs(arr[l] - x) > abs(arr[h] - x):
                l += 1
            else:
                h -= 1
        
        return arr[l:h+1]