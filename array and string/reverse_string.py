class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        front = 0
        rear = len(s) - 1
        
        while(front < rear):
            temp = s[front]
            s[front] = s[rear]
            s[rear] = temp
            front += 1
            rear -= 1