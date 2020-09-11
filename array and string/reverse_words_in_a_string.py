class Solution:
    def reverseWords(self, s: str) -> str:
        
        l = list(s.split())
        l.reverse()
        s1 = " ".join(i for i in l)
        return s1
        