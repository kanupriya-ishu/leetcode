class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        n = len(letters)
        
        l = 0
        h = n
        
        while l<h:
            mid = l + int((h - l) / 2)
            if (letters[mid] > target):
                h = mid;
            else:
                l = mid + 1; 
                
        return letters[l%n]